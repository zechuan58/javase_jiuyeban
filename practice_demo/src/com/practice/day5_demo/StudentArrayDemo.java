package com.practice.day5_demo;

import java.util.ArrayList;
/*
- 需求 : 自定义学生类:包含姓名,年龄,成绩属性.私有成员变量,生成无参,有参构造方法,生成get/set方法.
- 创建5个学生放到 ArrayList中。获取每个学生信息，统计总分，平均分，最高分，最低分并输出
 */
public class StudentArrayDemo {
    public static void main(String[] args) {
        //创建集合,存放学生信息
        ArrayList<Student> arr = new ArrayList<>();
        arr.add(new Student("小明", 20, 100));
        arr.add(new Student("小刚", 22, 98));
        arr.add(new Student("小强", 18, 95));
        arr.add(new Student("小刚", 25, 91));
        arr.add(new Student("小刚", 21, 85));

        //最高分
        Student max = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            Student stu = arr.get(i);
            if (stu.getScore() > max.getScore()) {
                max = stu;
            }
        }
        
        //最低分
        Student min = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            Student stu = arr.get(i);
            if (stu.getScore() < min.getScore()) {
                min = stu;
            }
        }
        
        //计算总分
        int sum=0;
        for (int i = 0; i < arr.size(); i++) {
            Student stu=arr.get(i);
            sum+=stu.getScore();
        }

        //求平均分
        int avg=sum/ arr.size();


        System.out.println("总分为:"+sum+"分");
        System.out.println("最高分为:"+max);
        System.out.println("最低分为:"+min);
        System.out.println("平均分为:"+avg+"分");
    }
}
