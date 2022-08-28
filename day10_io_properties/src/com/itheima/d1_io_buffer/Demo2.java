package com.itheima.d1_io_buffer;


import java.io.*;

/**
 * 目标：测试字节流采用不同方式复制文件的性能
 * 需求：
 *      1.使用原始流复制文件，一次复制一个字节
 *      2.使用原始流复制文件，一次复制1024个字节
 *      3.使用字节缓流复制文件，一个字节一个字节的复制
 *      4.使用字节缓冲流复制文件，一次复制1024个字节
 */
public class Demo2 {
    public static void main(String[] args) throws IOException {
        method2();
    }

    //复制文件方式1：原始流一次读写一个字节
    public static void method1() throws IOException {
        long time1 = System.currentTimeMillis();
        //1.创建输入输出流对象
        FileInputStream fis = new FileInputStream("D:\\a.exe");
        FileOutputStream fos = new FileOutputStream("D:\\b.exe");

        //2.读、写数据
        int b; //记录每次读取的一个字节
        while ((b = fis.read()) != -1) {
            fos.write(b);
        }

        //3.释放资源
        fis.close();
        fos.close();

        long time2 = System.currentTimeMillis();
        System.out.println("原始字节流一次读写一个字节：" + (time2 - time1));
    }

    //复制文件方式2：原始流一次读写一个字节数组
    public static void method2() throws IOException {
        long time1 = System.currentTimeMillis();
        //1.创建输入输出流对象
        FileInputStream fis = new FileInputStream("D:\\a.exe");
        FileOutputStream fos = new FileOutputStream("D:\\b.exe");

        //2.读、写数据
        byte[] bytes = new byte[1024];
        int len; //记录每次读写的字节个数
        while ((len = fis.read(bytes)) != -1) {
            fos.write(bytes, 0, len);
        }

        //3.释放资源
        fis.close();
        fos.close();

        long time2 = System.currentTimeMillis();
        System.out.println("原始字节流一次读写一个字节数组：" + (time2 - time1));
    }

    //复制文件方式3：缓冲字节流一次读写一个字节
    public static void method3() throws IOException {
        long time1 = System.currentTimeMillis();
        //1.创建输入输出流对象
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\a.exe"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\c.exe"));

        //2.读、写数据
        int b; //记录每次读取的一个字节
        while ((b = bis.read()) != -1) {
            bos.write(b);
        }

        //3.释放资源
        bis.close();
        bos.close();

        long time2 = System.currentTimeMillis();
        System.out.println("缓冲字节流一次读写一个字节：" + (time2 - time1));
    }

    //复制文件方式4：缓冲字节流一次读写一个字节数组 9秒
    public static void method4() throws IOException {
        long time1 = System.currentTimeMillis();

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\a.exe"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\d.exe"));

        //2.读、写数据
        byte[] bytes = new byte[1024];
        int len; //记录每次读写的字节个数
        while ((len = bis.read(bytes)) != -1) {
            bos.write(bytes, 0, len);
            bos.flush();
        }

        //3.释放资源
        bis.close();
        bos.close();

        long time2 = System.currentTimeMillis();
        System.out.println("缓冲字节流一次读写一个字节数组：" + (time2 - time1));
    }
}
