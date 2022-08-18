package com.itheima.d3_abstract.demo2;

/*
金卡类:是卡片的一种,就可以继承卡片类
      复写卡片类pay方法,打8折
*/
public class GoldCard extends Card {
    public GoldCard() {
    }

    public GoldCard(String name, double money) {
        super(name, money);
    }

    @Override
    public void pay(int money) {
        //金卡消费金额打8折
        double monetary = money * 0.8;
        //判断余额是否足够
        if (getMoney() >= monetary) {
            //将余额更新:让原来的金额-实际消费金额
            setMoney(getMoney() - monetary);
            System.out.println("您是金卡用户" + getName() + ",当前消费" + monetary + ",卡内余额" + getMoney());
        } else {
            System.out.println("余额不足,请及时充值!!!");
        }
    }
}
