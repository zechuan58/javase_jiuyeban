package com.itheima.d2_convert_stream;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * 需求：把OutputStream按照指定的编码转换为Writer，往文件中写入字符数据
 */
public class Demo3 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("day10_io_properties\\a.txt");


        //把FileOutputStream按照指定编码格式转换为Writer
        OutputStreamWriter osw = new OutputStreamWriter(fos);
        osw.write("世界好");

        //关流
        osw.close();
    }
}
