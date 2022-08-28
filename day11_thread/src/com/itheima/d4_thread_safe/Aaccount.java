package com.itheima.d4_thread_safe;

public class Aaccount{
    private int money=100000;

    /**
     * 取钱的方法
     * @param money 需要取钱的金额
     */

    public void drawMoney(int money){
        //获取线程的名称,方便后面使用
        String name=Thread.currentThread().getName();

        //判断余额是否足够
        if (this.money>=money){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //可以取钱
            this.money-=money;
            System.out.println(name+"取钱,取了"+money+"元,剩余"+this.money);
        }else{
            System.out.println(name+"取钱,余额不足");
        }
    }
}
