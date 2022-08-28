package com.itheima.d1_io_buffer;


import java.io.*;

/**
 * 目标：字节缓冲输入流和字节缓冲输出流的基本用法
 * 缓冲流使用方式：
 * 读、写数据和之前原始流的用法基本上一样，只是创建流对象不一样。
 * 实现步骤：
 * 1)创建缓冲流对象，对原始流对象进行包装
 * 2)读、写数据
 * 3)关闭流
 * BufferedInputStream和BufferedOutputStream读、 写数据
 * 注意: BufferedInputStream读取数据,依赖于InputStream原始流
 * BufferedoutptuStreamS数据,依赖于OutputStream 原始流
 */
public class Demo1 {
    public static void main(String[] args) throws IOException {
        //创建一个FileInputStream流对象,用来读取数据
        FileInputStream fis = new FileInputStream("day10_io_properties\\a.jpg");
        //创建一个BufferedInputStream流对象,封装fis
        BufferedInputStream bis = new BufferedInputStream(fis);

        //创建一个FileOutputStream流对象,用来读取数据
        //创建一个BufferedOutputStream流对象,封装fos
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("day10_io_properties\\c.jpg"));

        //2)读、写数据
        byte[] bytes=new byte[1024];
        int len;
        while ((len= bis.read(bytes))!=-1){
            bos.write(bytes,0,len);
        }

        // 3)关闭流
        bis.close();
        bos.close();
    }
}
