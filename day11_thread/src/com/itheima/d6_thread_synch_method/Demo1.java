package com.itheima.d6_thread_synch_method;

public class Demo1 {
    public static void main(String[] args) {
        Account account = new Account();

        DrawThread t1 = new DrawThread(account, "小明");
        DrawThread t2 = new DrawThread(account, "小红");

        t1.start();
        t2.start();
    }
}
