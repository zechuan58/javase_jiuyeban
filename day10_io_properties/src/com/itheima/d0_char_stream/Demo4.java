package com.itheima.d0_char_stream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
目标：使用字符流来复制文件
需求：把a.txt文件中的内容，复制到b.txt文件中
分析：
    1)使用FileReader流，读取a.txt文件
    2)使用FileWriter流，写入b.txt

【注意：使用字符流，只能复制文本文件，不能复制图片、视频、音乐...文件】
 */
public class Demo4 {
    public static void main(String[] args) throws IOException {
        //使用FileReader流，读取a.txt文件
        FileReader fr = new FileReader("day10_io_properties\\a.txt");

        //使用FileWriter流，写入b.txt
        FileWriter fw = new FileWriter("day10_io_properties\\b.txt");
        //一次读1024个字符，一次写1024个字符
        char[] chars = new char[1024];
        int len;
        while ((len=fr.read(chars))!=-1){
            fw.write(chars,0,len);
        }


        //关闭流
        fr.close();
        fw.close();

    }
}
