package com.zm.slf4j.demo;

import org.apache.log4j.Logger;
import org.junit.Test;

/**
 * * @author MrLi
 * * @projectName log-demo
 * * @title   Log4jDemo
 * * @package  com.zm.log
 * * @description  log4j测试
 * * @date  2022/1/25 17:40
 * * @version V1.0.0
 */
public class Log4jDemo {

    @Test
    public void test01(){
        //1. Log4j入门程序
        //简单的初始化
      //  BasicConfigurator.configure(); //提供默认的appenders  其实就是Handler   采取的是类中加载，没有用配置文件
        //2. 获取日志对象  传递的是一个类 ，因为他是按照类的包结构来进行继承的   跟之前的日志没什么区分，这个是按照类名作为日志的名字
        Logger logger = Logger.getLogger(Log4jDemo.class);
        //for (int i = 0; i < 50; i++) {
            //3. 输出日志 日志级别 --  log4j的经典级别
            logger.fatal("fatal"); //非常严重的错误 等同于jul中的 server 造成系统崩溃的错误
            logger.error("error"); //错误的级别，往往在生产中最为最高级别来进行使用、
            logger.warn("warn"); //警告信息，可能会对系统造成影响，需要关注的
            logger.info("info"); //一般的信息，主要就是获取运行的资源、执行的过程、程序的流程等等
            logger.debug("debug"); //一般生产的时候使用，主要就是调试信息吗，上线时关闭
            logger.trace("trace"); //最低级别
      //  }

        // 一般生产中推荐使用的是： 生产中最高级别用error、有事用warn、没事用info、自己调试用debug
    }
}
