package com.itheima.d0_innerclass_member;

public class Outer {
    private int num = 10;

   /* //成员内部类
    public class Inner{
        public void show(){
            System.out.println("Outer...Inner...执行了" +num);
        }
    }*/

    //静态内部类
    public static class Inner{
        public static void show(){
            System.out.println("Outer...Inner...执行了");
        }
    }
}
