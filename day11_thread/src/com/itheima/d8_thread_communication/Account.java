package com.itheima.d8_thread_communication;

/*
账户类:封装账户的余额信息,存钱和取钱的业务逻辑
 */
public class Account {
    private int money = 100000;

    //存钱的方法
    //同步方法的锁对象:this
    public synchronized void saveMoney(int money) {
        String name = Thread.currentThread().getName();
        //判断余额是否为0
        if (this.money == 0) {
            //如果账户余额为0就表示没钱,才需要存钱
            this.money += money;
            System.out.println(name + "存钱,存" + money + "元,余额为" + this.money);
            //存完钱之后,账户有钱,把等待线程唤醒
            this.notifyAll();
        } else {
            //如果余额不为0表示有钱,不需要存钱,让线程等待
            //调用wait方法,让线程等待,wait方法必须让锁锁对象调用
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    //取钱的方法
    public synchronized void drawMoney(int money) {
        String name = Thread.currentThread().getName();
        //判断余额是否大于等于取钱金额
        if (this.money >= money) {
            //有钱就可以取钱
            this.money -= money;
            System.out.println(name + "取钱,取" + money + "元,余额为" + this.money);
            //取完钱之后没有钱了,唤醒等待线程
            this.notifyAll();
        } else {
            //如果余额为0表示没钱,不需要取钱,让线程等待
            //调用wait方法,让线程等待,wait方法必须让锁锁对象调用
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
