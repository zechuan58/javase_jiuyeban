package com.itheima.d4_thread_safe;


public class Demo4 {
    public static void main(String[] args) {
        //先创建一个账户对象
        Aaccount aaccount=new Aaccount();

        //创建两个线程对象
        DrawThread dt1=new DrawThread(aaccount);
        dt1.setName("小明");
        dt1.start();

        DrawThread dt2=new DrawThread(aaccount);
        dt2.setName("小红");
        dt2.start();
    }
}
