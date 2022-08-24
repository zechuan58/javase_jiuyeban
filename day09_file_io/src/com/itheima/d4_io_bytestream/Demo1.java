package com.itheima.d4_io_bytestream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 目标：使用FileInputStream读取文件中的字节三个步骤
 *
 * 第一步：创建FileInputStream流对象(搭桥)
 * 第二步：调用read方法读取数据(过桥)
 * 第三步：关闭流(拆桥)
 */
public class Demo1 {
    public static void main(String[] args) throws IOException {
        //第一步：创建FileInputStream流对象(搭桥)
        //文件路径必须存在
        FileInputStream fis = new FileInputStream("day09_file_io\\a.txt");

        //第二步：调用read方法读取数据(过桥)
        int b;//记录每次读取的一个字节
        while ((b= fis.read())!=-1){
            System.out.println(b);
        }

        //第三步：关闭流
        fis.close();
    }
}
