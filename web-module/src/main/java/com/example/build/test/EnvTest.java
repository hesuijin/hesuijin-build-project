package com.example.build.test;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author HeSuiJin
 * @Date 2021/8/22
 */
@Slf4j
@RestController
@RequestMapping("EnvTest")
public class EnvTest {

    @Value("${env.value}")
    private String ENV_VALUE;

    @GetMapping("getEnvValue")
    public String getEnvValue() {
        System.out.println("打印环境变量："+ ENV_VALUE);
        log.info("打印环境变量：" + ENV_VALUE);
        return ENV_VALUE;
    }
}
