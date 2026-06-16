package com.luoshanghua.com;

import com.luoshanghua.com.constant.FileConstant;
import com.luoshanghua.com.tools.DishTool;
import com.luoshanghua.com.tools.OrderTool;
import org.junit.jupiter.api.Test;
import org.springframework.ai.openai.OpenAiChatModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SkyTakeOutAiApplicationTests {

    @Autowired
    private DishTool dishTool;

    @Autowired
    private OrderTool orderTool;

    @Autowired
    private OpenAiChatModel model;

    @Test
    void contextLoads() {

//        String jsonStr = JSONUtil.toJsonStr(LocalDateTime.now().plusHours(24 * 3));
//        System.out.println(jsonStr);
//        LocalDateTime timeout = JSONUtil.toBean(jsonStr, LocalDateTime.class);
//        System.out.println(LocalDateTime.now().compareTo(timeout));

        System.out.println(FileConstant.FILE_SAVE_DIR);


//        ChatClient chatClient = ChatClient.builder(model).defaultAdvisors(new MyLoggerAdvisor()).build();
//
//        String s = chatClient.prompt("你好").call().content();



//
//        OrderQuery orderQuery = new OrderQuery();
//        orderQuery.setAddress("aaa");
//        orderQuery.setPhone("1222222");
//        List<String> dishes = new ArrayList<>();
//        dishes.add("馒头");
//        orderQuery.setDishesName(dishes);
//        Map<String,Integer> dishNumber = new HashMap<>();
//        dishNumber.put("馒头",2);
//        orderQuery.setDishesNumber(dishNumber);
//        Map<String, BigDecimal> dishPrice = new HashMap<>();
//        dishPrice.put("馒头",BigDecimal.valueOf(1));
//        orderQuery.setDishesPrice(dishPrice);
//        Map<String,String> dishImage = new HashMap<>();
//        dishImage.put("馒头","http://localhost:8081/17756319371133837.jpg");
//        orderQuery.setDishesImage(dishImage);
//        List<String> setmeals = new ArrayList<>();
//        setmeals.add("我是元神高手喵");
//        orderQuery.setSetmealsName(setmeals);
//        Map<String,Integer> setmealNumber = new HashMap<>();
//        setmealNumber.put("我是元神高手喵",1);
//        orderQuery.setSetmealsNumber(setmealNumber);
//        Map<String, BigDecimal> setmealPrice = new HashMap<>();
//        setmealPrice.put("我是元神高手喵",BigDecimal.valueOf(678));
//        orderQuery.setSetmealsPrice(setmealPrice);
//        Map<String,String> setmealImage = new HashMap<>();
//        setmealImage.put("我是元神高手喵","http://localhost:8081/17756328097712842.jpg");
//        orderQuery.setSetmealsImage(dishImage);
//
//
//
//        OrderVO orderVO = orderTool.makeOrder(orderQuery);
//        System.out.println(orderVO);

//        List<OrderVO> orderVOS = orderTool.queryOrder("114514");
//
//        SetmealQuery setmealQuery = new SetmealQuery();
//        setmealQuery.setCategory(new ArrayList<>());
//        List<String>
//        setmealQuery.setCategory();
//        System.out.println(orderVOS);

    }

}
