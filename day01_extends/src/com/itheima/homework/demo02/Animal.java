package com.itheima.homework.demo02;
/*
动物类
 */
public class Animal {
    //共有属性
    private int age;
    private String color;

    public Animal() {
    }

    public Animal(int age, String color) {
        this.age = age;
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //行为:吃东西
    public void eat(String something){
    }
}
