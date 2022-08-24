package com.itheima.d4_io_bytestream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 目标：IO流处理异常的代码
      try{
        IO流读取、写入数据的代码
      }catch(异常类 e){
         异常捕获的代码
      }finally{
         释放资源的代码
      }
 */
public class Demo6 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            //第一步： 创建两个流对象
            fis = new FileInputStream("day09_file_io\\a.jpg"); //源文件
            fos = new FileOutputStream("day09_file_io\\b.jpg"); //目标文件

            //第二步：一边读、一边写
            byte[] bytes = new byte[1024];

            int len; //记录每次读取的有效字节个数
            while ((len = fis.read(bytes))!=-1){
                //把读取到的有效字节写到目标文件中去
                fos.write(bytes,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //不管前面的代码是否有异常，finally语句块中的代码都会执行。
            //第三步：关闭流
            if(fis!=null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }

            if(fos!=null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
