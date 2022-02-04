package com.zm.springlogging;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * * @author MrLi
 * * @projectName log-demo
 * * @title   LoggingTest
 * * @package  com.zm.springlogging
 * * @description  测试
 * * @date  2022/1/27 21:51
 * * @version V1.0.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest //同包结构，就不需要指定启动引导类了
public class LoggingTest {

    public final static Logger LOGGER = LoggerFactory.getLogger(LoggingTest.class);

    @Test
    public void test(){
        //打印日志信息
        LOGGER.error("error");
        LOGGER.warn("warn");
        LOGGER.info("info");
        LOGGER.debug("debug");
        LOGGER.trace("trace");
    }
}
