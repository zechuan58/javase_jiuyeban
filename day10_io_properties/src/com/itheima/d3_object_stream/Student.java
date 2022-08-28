package com.itheima.d3_object_stream;

import java.io.Serializable;

/*
Java语言规定：想要一个类的对象能够被序列化，这个类必须实现Serializable接口
 */
public class Student implements Serializable{
    private String name;
    private int age;


    //把序列号写死，不管改不改代码，序列号是固定的
    private static final long serialVersionUID = -321423412341324132L;

    public Student() {
    }

    public Student(String name, int age) {
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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
