package com.itheima.d1_io_buffer;

import java.io.*;

/**
 * 目标1：使用BufferedReader一行一行的读取数据
 * 目标2：使用BufferredWriter一行一行的写入数据
 */
public class Demo3 {
    public static void main(String[] args) throws IOException {
        //1.创建缓冲流对象，对原始流进行封装
        BufferedReader br = new BufferedReader(new FileReader("day10_io_properties\\a.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("day10_io_properties\\b.txt"));

        //2.一次读一行，一次写一行
        String line; //记录每次读取的一行字符串
        while ((line = br.readLine())!=null){
            //再把读取到的一行，写到目标文件中
            bw.write(line);
            //bw.write("\r\n"); //  换行符\r\n不具备跨平台性
            bw.newLine(); //换行，跨平台性(在Win 换行符是\r\n, 在Linux换行符\n, 在MacOs换行符\r)
        }

        //3.关闭流
        br.close();
        bw.close();
    }


   /* private static void method1() throws IOException {
        //1.创建缓冲流对象，对原始流进行封装
        BufferedReader br = new BufferedReader(new FileReader("day10_io_properties\\a.properties"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("day10_io_properties\\b.txt"));

        //2.读、写数据
        //字符缓冲流读写数据的方法和原始流读写数据的方法都是一样的，以一次读写多个字符为例演示
        char[] chars = new char[1024];
        int len;
        while ((len =br.read(chars))!=-1){
            bw.write(chars,0,len);
        }

        //3.关闭流
        br.close();
        bw.close();
    }*/

}
