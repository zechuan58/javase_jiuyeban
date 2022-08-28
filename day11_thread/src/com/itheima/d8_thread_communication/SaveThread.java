package com.itheima.d8_thread_communication;

/*
存钱的线程类
 */
public class SaveThread extends Thread {
    private Account account;

    public SaveThread(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        while (true) {
            account.saveMoney(100000);
        }
    }
}
