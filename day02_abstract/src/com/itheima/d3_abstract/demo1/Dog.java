package com.itheima.d3_abstract.demo1;
/*
子类继承抽象类:必须重写抽象类中的所有抽象方法
 */
public class Dog extends Animal{
    @Override
    public void run() {
        System.out.println("狗在狗刨");
    }
}
