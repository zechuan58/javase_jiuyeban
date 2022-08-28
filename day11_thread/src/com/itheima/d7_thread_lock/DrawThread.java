package com.itheima.d7_thread_lock;

/**
 * 存钱线程：需要和取钱线程共享一个账户，如何做到呢？
 *
 * 解决办法：
 *   可以将Account账户类，作为【存钱线程】和【取钱线程】的成员变量，让外部传递过来。
 *   到时候给两个线程传递同一个Account对象就可以了。
 */
public class DrawThread extends Thread{
    private Account account;

    public DrawThread (Account account, String name) {
        super(name);
        this.account = account;
    }

    @Override
    public void run() {
        //此处完全取钱的动作
        account.drawMoney(100000);
    }
}
