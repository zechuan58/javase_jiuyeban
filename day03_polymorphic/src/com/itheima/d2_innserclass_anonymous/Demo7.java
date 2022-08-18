package com.itheima.d2_innserclass_anonymous;


public class Demo7 {
    public static void main(String[] args) {
        //练习：在此处调用goSwimming方法，但是不允许显示的定义Swimming接口的实现类类；只允许传递匿名内部类对象

    }

    //去游泳的方法
    public static void goSwimming(Swimming sw){
        sw.swim();
    }
}
