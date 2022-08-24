package com.itheima.d4_io_bytestream;

import java.io.FileInputStream;

/**
 * 目标：读取文件中所有的字节，不会有乱码
 */
public class Demo3 {
    public static void main(String[] args) throws Exception {
        //1.创建FileInputStream流对象，关联文件路径
        FileInputStream fis = new FileInputStream("day09_file_io\\a.txt");

        //2.读取文件中的所有字节
        byte[] bytes = fis.readAllBytes();

        //把bytes数组转换为字符串
        String str = new String(bytes);
        System.out.println(str);

        //3.关流
        fis.close();

    }
}
