package com.itheima.d5_thread_synchronized;

public class DrawThread extends Thread {
    //为了创建线程时,多个线程共享同一个账户,所以把账户写成成员变量
    private Aaccount aaccount;

    public DrawThread(Aaccount aaccount) {
        this.aaccount = aaccount;
    }

    @Override
    public void run() {
        //调用取钱的方法
        aaccount.drawMoney(100000);
    }
}
