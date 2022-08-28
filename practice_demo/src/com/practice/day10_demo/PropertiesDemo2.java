package com.practice.day10_demo;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo2 {
    public static void main(String[] args) throws IOException {
        Properties pro = new Properties();
        pro.load(new FileReader("D:\\JavaDemo2\\javase_jiuyeban\\practice_demo\\src\\com\\practice\\day10_demo\\test1.properties"));
        Set<String> prokey = pro.stringPropertyNames();
        for (String s : prokey) {
            System.out.println(pro.getProperty(s));
        }
    }
}
