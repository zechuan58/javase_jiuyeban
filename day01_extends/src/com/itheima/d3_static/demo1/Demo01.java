package com.itheima.d3_static.demo1;

public class Demo01 {
    public static void main(String[] args) {
        System.out.println(Student.schoolName);//黑马程序员
        System.out.println("--------");
        Student s1=new Student();
        s1.schoolName="传智播客";
        System.out.println(s1.schoolName);

        Student s2=new Student();
        System.out.println(s2.schoolName);//传智播客
    }
}
