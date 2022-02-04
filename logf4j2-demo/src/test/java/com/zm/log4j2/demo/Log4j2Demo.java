package com.zm.log4j2.demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

/**
 * * @author MrLi
 * * @projectName log-demo
 * * @title   Log4j2Demo
 * * @package  com.zm.log4j2.demo
 * * @description  测试
 * * @date  2022/1/27 18:05
 * * @version V1.0.0
 */
public class Log4j2Demo {

    @Test
    public void test(){
        //1. 获取Logger对象  日志对象
             Logger logger = LogManager.getLogger(Log4j2Demo.class);
            //2. 输出日志信息
            logger.fatal("fatal"); //最高的级别，错误，系统崩溃
            logger.error("error"); //错误的级别，一般是生产中最高的级别
            logger.warn("warn"); // 警告信息，可能会对系统产生影响的，但是不影响正常运行
            logger.info("info"); // 正常的输出信息，输出程序执行的过程、状态等等
            logger.debug("debug"); // 一般是调式所使用到的
    }
}
