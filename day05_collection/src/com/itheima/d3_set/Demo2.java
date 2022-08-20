package com.itheima.d3_set;

import java.util.HashSet;
import java.util.LinkedHashSet;

/*
HashSet存储元素，保证元素唯一性的方式：
       复写元素的hashCode和euqals方法
 */
public class Demo2 {
    public static void main(String[] args) {
        HashSet<Student> hs=new HashSet<>();
        //存入hashSet数组,姓名年龄相同就认为是同一个对象,同一个对象只存一次
        hs.add(new Student("张三",20));
        hs.add(new Student("张三",20));
        hs.add(new Student("李四",17));
        hs.add(new Student("王五",21));
        hs.add(new Student("赵六",22));

        for (Student stu : hs) {
            System.out.println(stu);
        }


    }
}
