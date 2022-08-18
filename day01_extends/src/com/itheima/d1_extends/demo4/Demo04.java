package com.itheima.d1_extends.demo4;

public class Demo04 {
    public static void main(String[] args) {
        //调用子类的构造方法,创建子类对象
        Zi z1=new Zi(20);
        System.out.println(z1.num);

        Zi z2=new Zi(30);
        System.out.println(z2.num);
    }
}
