package com.practice.day6_demo;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * 定义一个学生类，要求有姓名、语文成绩、数学成绩、英语成绩
 * 选择合适的集合，往集合中添加3个学生对象，并按照总分从高到低输出到控制台
 * 如果总分相同，按照数学成绩排序
 */
public class StudentTest {
    public static void main(String[] args) {
        //用TreeSet集合
        TreeSet<Student> set = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                //获取o1和o2的成绩,并计算总分总分
                int sum1 = o1.getChinese() + o1.getMath() + o1.getEnglish();
                int sum2 = o2.getChinese() + o2.getMath() + o2.getEnglish();
                int num = sum1 - sum2;
                if (num==0){
                    num=o1.getMath()- o2.getMath();
                }
                return num;
            }
        });
        set.add(new Student("小明", 95, 90, 100));
        set.add(new Student("小红", 90, 95, 95));
        set.add(new Student("小明", 95, 100, 98));

        for (Student student : set) {
            int sum = student.getChinese() + student.getMath() + student.getEnglish();
            System.out.print(student);
            System.out.println(",总分:"+sum);
        }
    }
}
