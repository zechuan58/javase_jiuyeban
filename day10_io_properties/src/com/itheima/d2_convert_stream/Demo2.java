package com.itheima.d2_convert_stream;

import java.io.*;

/**
 * 乱码问题的原因：
 *      1)在读取文本文件时，如果文件中存在中文，由于GBK编码一个汉字占2个字节，UTF-8编码一个汉字占3个字节；
 *      2)文件创建后，文件本身编码已经固定了，如果代码中使用的编码和文件本身的编码不一致就会导致乱码问题。
 *
 * 注意：普通的字符流FileReader和FileWriter，在读取和写入字符数据时，采用的编码是UTF-8（默认的）
 */
public class Demo2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("day10_io_properties\\c.txt");
        //把InputStream转换为Reader, 可以指定编码（如果不指定，默认是UTF-8编码）
        InputStreamReader isr = new InputStreamReader(fis);

        char[] chars= new char[10];
        int len;
        while ((len = isr.read(chars))!=-1){
            //把bytes中有效的字节转换为字符串
            String str = new String(chars,0,len);
            System.out.println(str);
        }

        isr.close();
    }
}
