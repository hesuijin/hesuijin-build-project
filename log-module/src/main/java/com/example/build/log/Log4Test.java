package com.example.build.log;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description:
 * @Author HeSuiJin
 * @Date 2021/9/7
 */
@Slf4j
public class Log4Test {

    private final static Logger logger = LoggerFactory.getLogger(Log4Test.class);

    public static void main(String[] args) {

        logger.info("打印logger日志");

        log.info("打印@Slf4j日志");
    }

}
