package com.itheima.d1_extends.demo1;

public class Student extends Person {
    //特有属性:班级名称
    private String className;

    //空参构造方法
    public Student() {
    }

    //有三个参数的构造方法,用于给成员变量赋值
    public Student(String name, int age, String className) {
        super(name, age);
        this.className = className;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    //特有行为
    public void writeFeedback() {
        System.out.println("学生正在填写听课反馈");
    }
}
