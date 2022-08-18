package com.itheima.d5_polymorphic.demo2;
/*
狗类
 */
public class Dog implements Animal{
    @Override
    public void eat() {
        System.out.println("吃骨头");
    }

    //狗的特有方法
    public void swimming(){
        System.out.println("狗刨式游泳");
    }
}
