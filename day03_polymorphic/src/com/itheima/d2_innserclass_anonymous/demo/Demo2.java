package com.itheima.d2_innserclass_anonymous.demo;

import java.util.ArrayList;
import java.util.function.Consumer;

/*
匿名内部类在实际中运用
    1,一般不会主动的去使用匿名内部类
    2,在调用已经存在方法时,方法的参数如果是一个抽象类或者是一个接口,你需要传递抽象类子类对象或者接口的实现类对象
        1)写一个子类或者实现类,再创建对象,传给方法
        2)不写子类或者实现类,直接创建匿名内部类对象,传给方法就行。

        总结:匿名内部类在实际当中,更多时候是做参数使用
 */
public class Demo2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add("Java");


        //forEach:遍历集合的方法
        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.print(s);
            }
        });
    }
}
