package com.itheima.d7_thread_lock;

public class Demo1 {
    public static void main(String[] args) {
        Account account = new Account();

        DrawThread t1 = new DrawThread(account, "小明");
        DrawThread t2 = new DrawThread(account, "小红");

        t1.start();
        t2.start();
    }
}
