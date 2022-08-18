package com.itheima.d1_extends.demo2;

public class Zi extends Fu{
    String str="我是Zi类变量";
    public void show(){
        System.out.println("我是Zi类的show方法");
    }
    public void test(){
        System.out.println(str);
        show();
        System.out.println(super.str);
        super.show();
    }
}
