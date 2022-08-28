package com.itheima.d6_thread_synch_method;

import com.itheima.d5_thread_synchronized.Aaccount;

//账户类：封装账户的金额信息
public class Account {
    //默认有10000万块钱
    private int money = 100000;

    /*
    同步方法也是有锁对象的
        非静态方法：锁对象就是this
        静态方法：锁对象类的字节码 类名.class
     */
    public synchronized void drawMoney(int money){
        //先获取当前的线程名称
        String name = Thread.currentThread().getName();

        //判断余额是否足够，如果足够就打印: xxx来取钱了，取了xxx钱，余额是多少.
        if(this.money >=money){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.money-=money;
            System.out.println(name+"来取钱了，取了"+money+"元，还剩"+this.money+"元");
        }else {
            //如果钱不够，打印输出余额不足.
            System.out.println(name+"余额不足");
        }
    }
}
