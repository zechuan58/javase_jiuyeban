package com.itheima.d5_thread_synchronized;

public class Aaccount {
    private static int money = 100000;

    /**
     * 取钱的方法
     *
     * @param money 需要取钱的金额
     */

    public static void drawMoney(int money) {
        //获取线程的名称,方便后面使用
        String name = Thread.currentThread().getName();

        //锁对象:任意对象,但要保证唯一
        //this:就表示Aaccount对象,这个对象是被两个线程所共享,是唯一的
        synchronized (Aaccount.class) {//同步代码块
            //判断余额是否足够
            if (Aaccount.money >= money) {
                /*try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }*/
                //可以取钱
                Aaccount.money -= money;
                System.out.println(name + "取钱,取了" + money + "元,剩余" + Aaccount.money);
            } else {
                System.out.println(name + "取钱,余额不足");
            }
        }
    }
}
