package com.practice.day10_demo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StudentTese {
    public static void main(String[] args) throws IOException {
        List<Student> stuList = new ArrayList<>();
        stuList.add(new Student("迪丽热巴", "女", 18, 99));
        stuList.add(new Student("古力娜扎", "女", 19, 98));
        stuList.add(new Student("周杰伦", "男", 20, 88));
        stuList.add(new Student("蔡徐坤", "男", 19, 78));


        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\JavaDemo2\\javase_jiuyeban\\practice_demo\\src\\com\\practice\\day10_demo\\test2.txt"));
        for (Student student : stuList) {
            bw.write(student.getName()+","+student.getSex()+","+student.getAge()+","+student.getScore());
            bw.newLine();
        }
        bw.close();
    }
}
