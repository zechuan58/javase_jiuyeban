package com.itheima.d0_innerclass_member;

//目标： 创建外部类Outer里面的Inner对象
public class Demo5 {
    public static void main(String[] args) {
        //1.成员内部类创建对象格式:  外部类.内部类 变量名 = new 外部类().new 内部类();
//        Outer.Inner in = new Outer().new Inner();
//        in.show();

        //2.静态内部类创建对象格式: 外部类.内部类 变量名=new 外部类.内部类
//        Outer.Inner in=new Outer.Inner();
//        in.show();

        //3.如果Inner是一个静态内部类,Inner里面的show方法也是静态的
        Outer.Inner.show();
    }
}
