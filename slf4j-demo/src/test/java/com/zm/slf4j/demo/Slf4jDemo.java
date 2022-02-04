package com.zm.slf4j.demo;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.logging.ConsoleHandler;
import java.util.logging.SimpleFormatter;

/**
 * * @author MrLi
 * * @projectName log-demo
 * * @title   Slf4jDemo
 * * @package  com.zm.slf4j.demo
 * * @description  测试
 * * @date  2022/1/26 18:21
 * * @version V1.0.0
 */
public class Slf4jDemo {

    @Test
    public void test01() {
        //Slf4j的入门程序
        //1. 创建日志对象
        Logger logger = LoggerFactory.getLogger(Slf4jDemo.class);
        //2. 输出日志信息
        logger.error("error"); //错误的级别，一般是生产中最高的级别
        logger.warn("warn"); // 警告信息，可能会对系统产生影响的，但是不影响正常运行
        logger.info("info"); // 正常的输出信息，输出程序执行的过程、状态等等
        logger.debug("debug"); // 一般是调式所使用到的

        //可以使用占位符可以进行日志信息的输出
        logger.info("hello {},{}", "slf4j", "zm");  //后面是一个可变的参数列表

        //将异常信息作为日志的参数进行输出
        try {
            int i = 10 / 0;
        } catch (Exception e) {
            logger.info("异常出现: {}", e.getMessage());
        }
    }

   
}
