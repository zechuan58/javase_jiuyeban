package com.itheima.d4_io_bytestream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 复习：String如何创建对象
 *
 * JDK9异常的处理方式：不推荐
 */
public class Demo8 {
    public static void main(String[] args) throws FileNotFoundException {

        //第一步： 创建两个流对象
        FileInputStream fis = new FileInputStream("day09_file_io\\a.jpg"); //源文件
        FileOutputStream fos = new FileOutputStream("day09_file_io\\b.jpg"); //目标文件

        try(fis;fos) {
            //第二步：一边读、一边写
            byte[] bytes = new byte[1024];

            int len; //记录每次读取的有效字节个数
            while ((len = fis.read(bytes))!=-1){
                //把读取到的有效字节写到目标文件中去
                fos.write(bytes,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
