package com.luoshanghua.com.agent;

import com.luoshanghua.com.advisor.MyLoggerAdvisor;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.model.ChatModel;
import org.springframework.ai.tool.ToolCallback;

public class EvelynManus extends ToolCallAgent{

    public EvelynManus(ToolCallback[] allTools, ChatModel openAiChatModel){
        //父类构造函数初始化工具
        super(allTools);
        //设置智能体名字
        this.setName("EvelynManus");
        //设置最大执行步数
        this.setMaxSteps(5);
        //设置会话客户端
        ChatClient chatClient = ChatClient.builder(openAiChatModel)
                .defaultAdvisors(new MyLoggerAdvisor())
                .build();
        this.setChatClient(chatClient);
    }
}
