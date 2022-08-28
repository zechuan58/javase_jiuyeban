package com.practice.day10_demo;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {
    public static void main(String[] args) throws IOException {
        Properties pro = new Properties();
        pro.setProperty("品名","Iphone11 Pro Max");
        pro.setProperty("颜色","暗夜绿");
        pro.setProperty("存储容量","256G");
        pro.setProperty("价格","10899");
        pro.store(new FileWriter("D:\\JavaDemo2\\javase_jiuyeban\\practice_demo\\src\\com\\practice\\day10_demo\\test1.properties"),null);
    }
}
