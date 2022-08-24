package com.itheima.d4_io_bytestream;

import java.io.*;
import java.util.List;

/**
 * 小结：
 *    FileInputStream有两个read方法，这两个read方法的返回值含义是不一样。
 *      read(): 读取一个字节，返回字节对应的编码值；比如读取一个‘a’，返回97
 *      read(byte[] bytes): 读取多个字节存储到字节数组中，并返回读取到字节的个数。
 *
 *
 * 需求：文件复制的步骤
 * 实现步骤：
 *      第一步： 创建两个流对象
 *              FileInputStream用来读取源文件
 *              FileOutputStream用来写入目标文件
 *      第二步：一边读、一边写
 *             把读取到的字节用一个数组临时存起来，再把字节数组中的元素写到目标文件中去
 *
 *      第三步：关闭流
 */
public class Demo5 {
    public static void main(String[] args) throws IOException{
        //第一步： 创建两个流对象
        FileInputStream fis = new FileInputStream("day09_file_io\\a.txt"); //源文件
        FileOutputStream fos = new FileOutputStream("day09_file_io\\b.txt"); //目标文件

        //第二步：一边读、一边写
        byte[] bytes=new byte[1024];

        int len;//记录每次读取的字节数
        while ((len=fis.read(bytes))!=-1){
            //把读取的有效字节,写到目标文件中
            fos.write(bytes,0,len);
        }



        //第三步：关闭流
        fis.close();
        fos.close();
    }
}
