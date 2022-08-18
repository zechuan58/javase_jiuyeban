package com.itheima.d1_extends.demo5;

public class Demo5 {
    public static void main(String[] args) {
        Student s1= new Student("张三","黑马程序员");
        System.out.println(s1.getName()+","+ s1.getSchool());

        Student s2= new Student("李四");
        System.out.println(s2.getName()+","+s2.getSchool());

    }
}
