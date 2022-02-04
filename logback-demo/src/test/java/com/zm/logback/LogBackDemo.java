package com.zm.logback;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * * @author MrLi
 * * @projectName log-demo
 * * @title   LogBackDemo
 * * @package  com.zm.logback
 * * @description  测试
 * * @date  2022/1/27 14:55
 * * @version V1.0.0
 */
public class LogBackDemo {

    @Test
    public void test(){
        //1. 获取Logger对象  日志对象
        Logger logger = LoggerFactory.getLogger(LogBackDemo.class);
        for (int i = 0; i < 10000; i++) {
            //2. 输出日志信息
            logger.error("error"); //错误的级别，一般是生产中最高的级别
            logger.warn("warn"); // 警告信息，可能会对系统产生影响的，但是不影响正常运行
            logger.info("info"); // 正常的输出信息，输出程序执行的过程、状态等等
            logger.debug("debug"); // 一般是调式所使用到的
        }

    }
}
