package com.itheima.d8_thread_communication;

public class Demo8 {
    public static void main(String[] args) {
        Account account=new Account();

        //创建3个存钱对象
        SaveThread s1=new SaveThread(account);
        s1.setName("亲爹");
        SaveThread s2=new SaveThread(account);
        s2.setName("干爹");
        SaveThread s3=new SaveThread(account);
        s3.setName("岳父");



        DrawThread t1=new DrawThread(account);
        t1.setName("小红");
        DrawThread t2=new DrawThread(account);
        t2.setName("小明");

        s1.start();
        s2.start();
        s3.start();
        t1.start();
        t2.start();
    }
}
