package com.itheima.homework.demo02;

/*
猫类
 */
public class Cat extends Animal {
    public Cat() {
    }

    public Cat(int age, String color) {
        super(age, color);
    }

    @Override
    public void eat(String something) {
        System.out.println("颜色为:"+getColor()+"的"+getAge()+"岁"+"的猫,在吃"+something);

    }

    public void catchMouse() {
    }
}
