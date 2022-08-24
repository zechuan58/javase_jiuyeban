package com.itheima.d3_charset;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * 目标：使用String类的方法完成编码和解码的操作
 * 【结论：采用什么方式进行编码，就必须采用什么方式解码，否则就会产生乱码】
 */
public class Demo1 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s = "大吉大利";

        //按照默认的编码方案(UTF-8)，把字符串转换为字节数组
        byte[] bytes1 = s.getBytes();
        System.out.println(Arrays.toString(bytes1));

        //按照指定的的编码方案(GBK)，把字符串转换为字节数组
        byte[] bytes2 = s.getBytes("GBK");
        System.out.println(Arrays.toString(bytes2));

        System.out.println("-----------------");
        //把bytes1字节数组，按照默认的编码方案(UTF-8)再转换为字符串
        String s1 = new String(bytes1);
        System.out.println(s1);

        //把bytes2字节数组，再转换为字符串
        String s2 = new String(bytes2,"GBK");
        System.out.println(s2);
    }
}
