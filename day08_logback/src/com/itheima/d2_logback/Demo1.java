package com.itheima.d2_logback;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 目标：使用日志工具的记录信息
 */
public class Demo1 {

    //定义一个日志记录器
    public static final Logger LOGGER = LoggerFactory.getLogger(Demo1.class);

    public static void main(String[] args) {
        //开始记录日志
//        for (int i = 0; i < 10; i++) {
//            LOGGER.debug("当前循环次数是"+i);
//        }

        LOGGER.trace("我是trace级别的日志");
        LOGGER.debug("我是debug级别的日志");
        LOGGER.info("我是info级别的日志");
        LOGGER.warn("我是warn级别的日志");
        LOGGER.error("我是error级别的日志");

    }
}
