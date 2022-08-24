package com.itheima.d1_file;

import java.io.File;
/**
 * 目标：根据File类提供的构造方法创建File对象，
 * 注意：File对象仅仅只是封装一个路径，但是路径可以存在也可以不存在
 */
public class Demo1 {
    public static void main(String[] args) {
        //1.通过字符串路径创建File对象
        File f1 = new File("C:\\resources\\日记1.txt");

        //2.通过字符串父路径和子路径创建File对象
        File f2 = new File("C:\\resources","日记2.txt");

        //3.通过File对象的父路径和字符串子路径创建File对象
        File dir = new File("C:\\resources");
        File f3 = new File(dir,"日记3.txt");

        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
    }
}
