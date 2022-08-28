package com.itheima.d7_thread_lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//账户类：封装账户的金额信息
public class Account {
    //默认有10000万块钱
    private static int money = 100000;

    Lock lock = new ReentrantLock();//lock锁对象

    /*
    同步方法也是有锁对象的
        非静态方法：锁对象就是this
        静态方法：锁对象类的字节码 类名.class
     */
    public void drawMoney(int money) {
        //先获取当前的线程名称
        String name = Thread.currentThread().getName();

        lock.lock();//上锁
        //判断余额是否足够，如果足够就打印: xxx来取钱了，取了xxx钱，余额是多少.
        try {
            if (Account.money >= money) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Account.money -= money;
                System.out.println(name + "来取钱了，取了" + money + "元，还剩" + Account.money + "元");
            } else {
                //如果钱不够，打印输出余额不足.
                System.out.println(name + "余额不足");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();//解锁
        }
    }
}
