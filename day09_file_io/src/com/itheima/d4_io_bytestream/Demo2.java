package com.itheima.d4_io_bytestream;

import java.io.FileInputStream;
import java.util.Arrays;

/**
 * 目标：使用FileInputStream读取文件，一次读取多个字节
 * 实现步骤：
 *    第一步：创建FileInputStream流对象，关流读取的文件路径(搭桥)
 *    第二步：调用read方法，一次读取多个字节(过桥)
 *              准备一个字节数组，用来存储多个字节
 *    第三步：关闭流(拆桥)
 */
public class Demo2 {
    public static void main(String[] args) throws Exception {
        //第一步：创建FileInputStream流对象，关流读取的文件路径(搭桥)
        FileInputStream fis = new FileInputStream("day09_file_io\\a.txt");

        //第二步：调用read方法，一次读取多个字节(过桥)
        byte[] bytes = new byte[3];

        int len; //用来记录每次读取的有效字节个数
        while ((len = fis.read(bytes))!=-1){
            //bytes数组中从0索引开始的len个字节转换为字符串
            //创建一个字符串:从字节数组的0索引开始,往后取Len个元素,组成一个新的字符串
            String str = new String(bytes,0,len);
            System.out.println(str);
        }

        //第三步：关闭流(拆桥)
        fis.close();
    }
}
