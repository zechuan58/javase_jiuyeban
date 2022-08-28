package com.itheima.d0_char_stream;

import java.io.FileWriter;
import java.io.IOException;

/*
目标：学会使用FileWriter往文件中写入字符数据
实现步骤：
    第一步：创建FileWriter流对象，关联文件【搭桥】
    第二步：调用write方法写数据【过桥】
    第三步：关闭流【拆桥】

注意：FileWriter调用write方法时，其实没有直接把字符写到文件中去，应为在内存中有缓存。
     当你调用close方法是 ，它就会把内存中缓存的数据刷新到文件中，再关流。
 */
public class Demo3 {
    public static void main(String[] args) throws IOException {
        //第一步：创建FileWriter流对象，关联文件【搭桥】
        FileWriter fw = new FileWriter("day10_io_properties\\a.txt");

        //第二步：调用write方法写数据【过桥】
        //一次写一个字符
        fw.write(97);//a
        fw.write('a');//a

        //一次写一个字符串
        fw.write("hello");

        fw.write("\r\n");//换行
        //一次写一个字符数组
        char[] chars = {'w', 'o', 'r', 'l', 'd'};
        fw.write(chars);

        //一次写字符数组的一部分
        fw.write(chars,0,3);//wor

        //第三步：关闭流【拆桥】
        fw.close();
        //fw.flush(); //手动刷新
        //先刷新，再关流
    }
}
