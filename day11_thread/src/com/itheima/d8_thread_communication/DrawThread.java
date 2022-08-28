package com.itheima.d8_thread_communication;

/*
取钱的线程类,需要和存钱的线程类共享同一个账户
 */
public class DrawThread extends Thread {
    private Account account;

    public DrawThread(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        while (true) {
            //调用账户类中取钱的方法
            account.drawMoney(100000);
        }
    }
}
