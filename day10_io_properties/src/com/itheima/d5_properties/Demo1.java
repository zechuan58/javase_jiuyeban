package com.itheima.d5_properties;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;
import java.util.Set;

/**
 * Properties是一个Map集合的子类，是一个双列集合，所以Map的方法它都能用。
 * Properties在添加键和值时，【规范要求键和值都是String类型】。但是如果使用Map集合的put方法那么它参数可以接收任意类型。
 * 这样并不好，所以Properties集合提供了自己特有的方法来添加键和值
 */
public class Demo1 {
    public static void main(String[] args) throws IOException {

        Properties pro = new Properties();

        //添加键值对: 类似于Map的put方法
        pro.setProperty("张三","20");
        pro.setProperty("李四","30");
        pro.setProperty("王五","25");

        //获取键对应的值：类似于Map的get方法
        String value1 = pro.getProperty("张三");
        String value2 = pro.getProperty("李四");
        String value3 = pro.getProperty("王五");

        System.out.println(value1);
        System.out.println(value2);
        System.out.println(value3);

        //遍历Properties集合
        //获取所有的键：类似于Map类keySet()
        Set<String> keys = pro.stringPropertyNames();
        for (String key : keys) {
            String value = pro.getProperty(key);
            System.out.println(key+"...."+value);
        }
    }
}
