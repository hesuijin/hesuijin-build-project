package com.example.build;


import com.example.build.component.JunitComponent;
//import org.junit.Test;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Description:
 * @Author HeSuiJin
 * @Date 2021/12/5
 */
//@RunWith(SpringRunner.class)
@SpringBootTest
public class JunitClassAnnotation {

    @Autowired
    JunitComponent junitComponent;

    @Test
    public void junitAnnotationTest() {
        System.out.println("你好，单元测试! ");
    }
}
