package com.example.build.junit;

import com.alibaba.fastjson.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Description:
 * @Author HeSuiJin
 * @Date 2021/8/21
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class JunitTest {

    @Test
    public void publicJunit4Test() {
        System.out.println("你好，Junit4 单元测试!");
    }


    @org.junit.jupiter.api.Test
    public void publicJunit5Test() {
        System.out.println("你好，Junit5 单元测试!");
    }
}

