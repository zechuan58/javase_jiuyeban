package com.itheima.d4_io_bytestream;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 目标：使用FileOutputStream流对象往文件中写数据的
 * 实现步骤：
 * 第一步：创建FileOutputStream流对象，关流文件路径(搭桥)
 * 第二步：调用write方法写数据(过桥)
 * 第三步：关闭流(拆桥)
 */
public class Demo4 {
    public static void main(String[] args) throws IOException {
        //第一步：创建FileOutputStream流对象，关流文件路径(搭桥)
        //注意1：如果文件不存在，会自动创建；如果存在新的文件覆盖旧的文件
        //注意2：第二个参数true, 文件不被覆盖
        //注意3:父路径必须存在,否则会出现异常
        FileOutputStream fos = new FileOutputStream
                ("day09_file_io\\a.txt");

        //第二步：调用write方法写数据(过桥)
        //一次写一个字节
        fos.write(97); //a
        fos.write(98); //b
        fos.write(99); //c

        //一次写多个字节，这多个字节需要放在一个byte数组中去
        byte[] bytes = {97, 98, 99, 100, 101, 102, 103};//abcdefg
        fos.write(bytes);

        //一次写字节数组中的一部分
        fos.write(bytes, 0, 2); //ab

        //一次写一个字符串(需要把字符串转换为字节数组)
        fos.write("你好世界".getBytes());
        //换行
        fos.write("\r\n".getBytes());
        fos.write("HelloWorld".getBytes());

        //第三步：关闭流(拆桥)
        fos.close();
    }
}
