package com.example.build;

import com.alibaba.fastjson.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Description:
 * @Author HeSuiJin
 * @Date 2021/11/28
 */

//SpringRunner  实际上继承了SpringJUnit4ClassRunner  因此直接使用SpringJUnit4ClassRunner即可 但这种情况下仅能Junit4
//@RunWith(SpringJUnit4ClassRunner.class)
@RunWith(SpringRunner.class)
@SpringBootTest
public class JunitIntroduce {

    @Test
    public void junit4Test(){
        System.out.println("你好啊 Junit4");
    }

    @org.junit.jupiter.api.Test
    public void junit5Test(){
        System.out.println("你好啊 Junit5");
    }
}
