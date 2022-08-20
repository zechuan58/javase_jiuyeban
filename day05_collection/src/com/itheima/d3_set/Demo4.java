package com.itheima.d3_set;


import java.util.LinkedHashSet;

/*
LinkedHashSet集合存储学生对象
    保证元素唯一:复写hashCode和equals方法
 */
public class Demo4 {
    public static void main(String[] args) {
        LinkedHashSet<Student> set=new LinkedHashSet<>();
        set.add(new Student("张三",23));
        set.add(new Student("lisi",23));
        set.add(new Student("wangwu",23));
        set.add(new Student("张三",23));
        set.add(new Student("张三",23));


        for (Student student : set) {
            System.out.println(student);
        }
    }
}
