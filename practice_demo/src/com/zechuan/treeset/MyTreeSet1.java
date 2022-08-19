package com.zechuan.treeset;

import java.util.TreeSet;

/**
 * TreeSet集合存储自定义Student类型
 */
public class MyTreeSet1 {
    public static void main(String[] args) {
        TreeSet<Student> ts=new TreeSet<>();
        Student s1=new Student("小明",21);
        Student s2=new Student("小明明",19);
        Student s3=new Student("小小明",23);

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        System.out.println(ts);
    }
}
