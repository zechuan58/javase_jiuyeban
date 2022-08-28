package com.itheima.d5_properties;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/*
目标：通过Properties集合来读取、写入配置文件
 */
public class Demo2 {
    public static void main(String[] args) throws IOException {
        Properties pro = new Properties();
        pro.setProperty("张三","20");
        pro.setProperty("李四","30");
        pro.setProperty("王五","25");
        //把pro集合中的键和值写到配置文件中去
        pro.store(new FileWriter("day10_io_properties\\a.properties"),null);

        Properties pro1 = new Properties();
        //读取文件中的键值对到集合
        pro1.load(new FileReader("day10_io_properties\\a.properties"));
        System.out.println(pro1);
    }
}
