package com.itheima.d0_char_stream;


import java.io.FileReader;
import java.io.IOException;

/**
 * 目标：字符流读取文件中的每一个字符
 *  实现步骤：
 *      第一步：创建FileReader字符输入流对象，关联文件路径【搭桥】
 *
 *      第二步：调用read方法读取字符【过桥】
 *
 *      第三步：调用close方法关闭流
 */
public class Demo1 {
    public static void main(String[] args) throws IOException {
        //第一步：创建FileReader字符输入流对象，关联文件路径【搭桥】
        FileReader fr = new FileReader("day10_io_properties\\a.txt");

        //第二步：调用read方法读取字符【过桥】
        int b; //记录每次读取的一个字符对应编码值
        while ((b = fr.read())!=-1){
            System.out.println((char)b);
        }

        //第三步：调用close方法关闭流
        fr.close();
    }
}
