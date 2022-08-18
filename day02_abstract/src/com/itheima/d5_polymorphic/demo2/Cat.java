package com.itheima.d5_polymorphic.demo2;
/*
猫类
 */
public class Cat implements Animal{
    @Override
    public void eat() {
        System.out.println("吃小鱼干");
    }

    //猫的特有方法
    public void catchMouse(){
        System.out.println("猫抓老鼠");
    }
}
