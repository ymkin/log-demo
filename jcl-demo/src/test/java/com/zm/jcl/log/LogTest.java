package com.zm.jcl.log;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;

/**
 * * @author MrLi
 * * @projectName log-demo
 * * @title   LogTest
 * * @package  com.zm.jcl.log
 * * @description  测试
 * * @date  2022/1/26 15:37
 * * @version V1.0.0
 */
public class LogTest {
    /**
     * 日志测试
     */
    @Test
    public void test01(){
        //1. 创建Log 对象
        Log log = LogFactory.getLog(LogTest.class);
        //2. 打印日志级别  跟log4j 级别是很类似的
        log.error("error"); //错误的日志级别，往往在生产中最为最高级别进行使用
        log.warn("warn"); //警告信息，可能会对系统造成影响，需要关注的
        log.info("info"); //一般的信息，主要就是获取运行的资源、执行的过程、程序的流程等等
        log.debug("debug"); // 一般生产的时候使用，主要就是调试信息吗，上线时关闭

    }
}
