package com.itheima.d4_io_bytestream;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
  目标：JDK7版本处理异常的方式

  格式：
     try(定义流对象){
           有可能产生异常的代码
     }catch(异常类 e){
           捕获异常的代码
     }

  优点：不管有没有异常，流会自动释放
 */
public class Demo7 {
    public static void main(String[] args) {
        try (
            //第一步： 创建两个流对象
            FileInputStream fis = new FileInputStream("day09_file_io\\a.txt"); //源文件
            FileOutputStream fos = new FileOutputStream("day09_file_io\\b.txt"); //目标文件
        ){
            //第二步：一边读、一边写
            byte[] bytes = new byte[1024];

            int len;//记录每次读取的字节数
            while ((len = fis.read(bytes)) != -1) {
                //把读取的有效字节,写到目标文件中
                fos.write(bytes, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}





