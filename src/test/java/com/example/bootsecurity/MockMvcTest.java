package com.example.bootsecurity;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @ClassName: MockMvc
 * @Description:
 * @date: 2022/5/10 20:04
 * @version: 1.0.0
 */
@SpringBootTest
@AutoConfigureMockMvc   // 由spring-test提供，依赖junit5
public class MockMvcTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    void testMockMvc() throws Exception {

        // 发起一个模拟请求，不依赖网络，不依赖web服务，不需要启动项目
        mockMvc.perform(
                        MockMvcRequestBuilders.get("/hello")
                                .accept(MediaType.APPLICATION_JSON_VALUE)
                )
                //响应断言
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.data").value("Hell"))
                .andDo(MockMvcResultHandlers.print());

    }

    @Test
    void testInteger() {

        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("Hello");
        list.add("World");
        list.add("===");
        list.add("Python");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals("Hello")) {
                iterator.remove();
            }
        }

        synchronized (this) {

            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

//        for (String str : list) {
//            if (str.equals("Hello")) {
//                list.remove(str);
//            }
//        }

//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i).equals("Hello")) {
//                list.remove(i);
//            }
//        }

        System.out.println(list);



        /*List<String> platformList = new ArrayList<>();
        platformList.add("博客园");
        platformList.add("CSDN");
        platformList.add("掘金");
        for (String platform : platformList) {
            if (platform.equals("博客园")) {
                platformList.remove(platform);
            }
        }
        System.out.println(platformList);*/

    }

}
