package com.luoshanghua.com.agent.simpleChat;

import com.luoshanghua.com.advisor.MyLoggerAdvisor;
import com.luoshanghua.com.common.ChatSystem;
import com.luoshanghua.com.constant.FileConstant;
import com.luoshanghua.com.content.BaseContent;
import com.luoshanghua.com.memory.FileBasedChatMemory;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.messages.Message;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.openai.OpenAiChatModel;
import org.springframework.ai.tool.ToolCallback;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;

public class SimpleChatAgent {

    private final ChatClient chatClient;
    private final FileBasedChatMemory chatMemory;
    private final ToolCallback[] allTools;

    public SimpleChatAgent(OpenAiChatModel chatModel,ToolCallback[] allTools) throws IOException {
        this.chatClient = ChatClient.builder(chatModel).defaultAdvisors(new MyLoggerAdvisor()).build();
        this.chatMemory = new FileBasedChatMemory(Paths.get(FileConstant.FILE_SAVE_DIR,BaseContent.getUser().getUserName(),"chatMemory").toString());
        this.allTools = allTools;
    }

    public String simpleChat(String userPrompt,String chatId){
        //获取历史会话
        List<Message> messages = chatMemory.get(chatId);
        Prompt historyChat = new Prompt(messages);
        return chatClient.prompt(historyChat).system(ChatSystem.CHAT_SYSTEM).user(userPrompt).toolCallbacks(allTools).call().content();
    }

}
