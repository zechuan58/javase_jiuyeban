package com.itheima.d2_convert_stream;

import java.io.*;

/**
 * 目标：分别使用BufferedReader读取utf-8格式和GBK格式的文件，观察是否有乱码
 * 结论：
 *     在使用字符流读取文本文件时，使用的默认编码是UTF-8; 如果读取的不是UTF-8格式的文件就会有乱码问题。
 *
 * 在Java语言中提供了另外一种流，叫做转换流；它可以指定编码来读取、写入指定编码格式的文件。就可以避免乱码问题
 *
 */
public class Demo1 {
    public static void main(String[] args) throws IOException {
        method2();
    }

    //使用BufferedReader读取UTF-8编码格式的文件
    public static void method1() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("day10_io_properties\\a.properties"));
        String s = br.readLine();
        System.out.println(s);
    }

    //使用BufferedReader读取GBK编码格式的文件
    public static void method2() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("day10_io_properties\\b.txt"));
        String s = br.readLine();
        System.out.println(s);
    }
}
