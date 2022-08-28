package com.itheima.d3_object_stream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
/**
 * 目标：使用ObjectInputStream读取文件中的对象(反序列化)
 */
public class Demo2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //第一步：创建ObjectInputStream流对象
        ObjectInputStream ois =
                new ObjectInputStream(new FileInputStream("day10_io_properties\\a.txt"));

        //第二步：读取对象
        ArrayList<Student> list  =
                (ArrayList<Student>) ois.readObject();

        for (Student student : list) {
            System.out.println(student);
        }

        //第三步：关闭流
        ois.close();
    }
}
