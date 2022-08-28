package com.itheima.d3_object_stream;

import java.io.*;
import java.util.ArrayList;

/**
 * 目标：使用ObjectOutputStream往文件中写对象
 * 注意：如果想要序列化、反序列化，必须让写入和对象的类实现Serializable（标记）
 */
public class Demo1 {
    public static void main(String[] args) throws Exception {
        //第一步：创建ObjectOutputStream流对象
        ObjectOutputStream oos =
                new ObjectOutputStream(new FileOutputStream("day10_io_properties\\a.txt"));

        //第二步：写对象到文件
        Student s1 = new Student("小明1",21);
        Student s2 = new Student("小明2",22);
        Student s3 = new Student("小明3",23);
        ArrayList<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);

        //把集合作为一个对象写到文件中
        oos.writeObject(list);

        //第三步：关闭流
        oos.close();
        System.out.println("---------------");
        //第一步：创建ObjectInputStream流对象
        ObjectInputStream ois =
                new ObjectInputStream(new FileInputStream("day10_io_properties\\a.txt"));

        //第二步：读取对象
        ArrayList<Student> list1  =
                (ArrayList<Student>) ois.readObject();

        for (Student student : list1) {
            System.out.println(student);
        }

        //第三步：关闭流
        ois.close();


        /*ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("day10_io_properties\\a.txt"));
        oos.writeObject(new Student("小明",23));
        oos.close();

        System.out.println("------------------");
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("day10_io_properties\\a.txt"));
        Object obj=ois.readObject();
        System.out.println(obj);
        ois.close();*/
    }
}
