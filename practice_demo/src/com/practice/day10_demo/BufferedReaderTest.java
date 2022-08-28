package com.practice.day10_demo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class BufferedReaderTest {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("D:\\JavaDemo2\\javase_jiuyeban\\practice_demo\\src\\com\\practice\\day10_demo\\test2.txt"));
        List<Student> list = new ArrayList<>();
        String line;
        while ((line = br.readLine()) != null) {
            String[] array = line.split(",");

            //创建一个Student对象，并且将姓名、性别、年龄、分数设置给对象
            Student stu = new Student();
            stu.setName(array[0]);
            stu.setSex(array[1]);
            stu.setAge(Integer.parseInt(array[2]));
            stu.setScore(Integer.parseInt(array[3]));

            list.add(stu);
        }
        br.close();
        for (Student student : list) {
            System.out.println(student);
        }
    }
}
