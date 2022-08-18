package com.itheima.d1_extends.demo1;

/**
 * 定义人类:描述学生和老师的共性
 * 属性:姓名、年龄
 * 行为:查看课表
 */
public class Person {
    //属性:姓名、年龄
    private String name;
    private int age;

    //空参数构造
    public Person() {
    }

    //有两个参数的构造方法,用于给成员变量赋值
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //行为:查看课表
    public void queryCourse() {
        System.out.println("查看课表");
    }
}
