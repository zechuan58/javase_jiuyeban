package com.itheima.d4_print_stream;

import java.io.*;

/**
 * 目标：使用PrintStream和PrintWriter打印流来往任意的文件中打印数据
 *
 * 注意：PrintWriter或者PrintStream可以往文件中写入任何类型的数据，这些数据会原样输出。
 */
public class PrintDemo1 {
    public static void main(String[] args) throws IOException {
        //1.创建PrintWriter对象，关联文件
        //PrintStream pw = new PrintStream("day10_io_properties\\a.txt");
        //PrintWriter pw = new PrintWriter(new File("day10_io_properties\\a.txt"));
        //PrintWriter pw = new PrintWriter(new FileOutputStream("day10_io_properties\\a.txt"));
        PrintWriter pw = new PrintWriter(new FileWriter("day10_io_properties\\a.txt"));

        //2.写数据
        //pw.write(97);
        //pw.write(98);
        pw.write("你好世界");

        //打印流中提供了print和println方法，可以打印输出任何类型的数据
        //原因：print和println方法的底层，它会把任何类型的数据都转换为字符串，再打印输出
        //pw.println(97); //97-->"97"
        //pw.println(98); //98-->"98"
        //pw.println(true); //true-->"true"
        //pw.println(3.14); //3.14-->"3.14"
        //pw.println("哈哈哈"); //"哈哈哈“
//
        //3.关闭流
        pw.close();

        //System.out.println("-------------------");

        //System.out是一个PrintStream打印流对象，它的打印输出目的地就是控制台。
        //修改输出语句的打印目的地
        //System.setOut(new PrintStream("C:\\itheima\\a.properties"));
        //System.out.println("helloWorld");
        //System.out.println(127);
        //System.out.println(3.14);
    }
}
