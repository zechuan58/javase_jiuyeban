package com.itheima.d2_convert_stream;

import java.io.*;

/*
需求：把a.txt文件中的内容，复制到b.txt文件中； 其中a.txt是GBK编码格式，b.txt是UTF-8编码格式。
分析：
    a.txt是GBK格式的，按照GBK编码格式来读取数据，使用InputStreamReader来读
    b.txt是UTF-8格式的，按照UTF-8编码格式来写数据，使用OutputStreamWriter来写
 */
public class Demo4 {
    public static void main(String[] args) throws Exception {
        //使用InputStreamReader来读取a.txt文件，指定GBK格式
        InputStreamReader isr = new InputStreamReader(new FileInputStream("day10_io_properties\\a.txt"),"GBK");
        //使用OutputStreamWriter来写入b.txt文件，指定UTF-8格式
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("day10_io_properties\\b.txt"),"UTF-8");

        //读取、写入数据
        char[] chars = new char[1024];
        int len; //记录每次读取的字符个数
        while ((len = isr.read(chars))!=-1){
            osw.write(chars,0,len);
        }

        //关闭流
        isr.close();
        osw.close();
    }
}
