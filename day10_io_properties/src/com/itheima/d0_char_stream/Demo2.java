package com.itheima.d0_char_stream;


import java.io.FileReader;
import java.io.IOException;

/**
 * 目标：字符流一次读取文件中的多个字符
 * 实现步骤：
 * 第一步：创建FileReader流对象，关联文件【搭桥】
 * 第二步：调用read方法，一次读取多个字符【过桥】
 * 需要准备一个char类型的数组，用来存储读取到的多个字符
 * 第三步：关闭流【拆桥】
 */
public class Demo2 {
    public static void main(String[] args) throws IOException {
        //第一步：创建FileReader流对象，关联文件【搭桥】
        FileReader fr = new FileReader("D:day10_io_properties\\a.txt");

        //第二步：调用read方法，一次读取多个字符【过桥】
        char[] chars = new char[1024];
        int len;//记录每次读取的字符个数
        while ((len = fr.read(chars)) != -1) {
            //把chars数组中的有效字符，转换为字符串
            String str = new String(chars, 0, len);
            System.out.println(str);
        }
        //第三步：关闭流【拆桥】
        fr.close();
    }
}
