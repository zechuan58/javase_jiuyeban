package com.itheima.d3_abstract.demo2;

/*
银卡类:是卡片的一种,就可以继承卡片类
      复写卡片类pay方法,打85折
*/
public class SilverCard extends Card {
    public SilverCard() {
    }

    public SilverCard(String name, double money) {
        super(name, money);
    }

    @Override
    public void pay(int money) {
        //银卡消费金额打85折
        double monetary = money * 0.85;
        //判断余额是否足够
        if (getMoney() >= monetary) {
            //将余额更新:让原来的金额-实际消费金额
            setMoney(getMoney() - monetary);
            System.out.println("您是银卡用户" + getName() + ",当前消费" + monetary + ",卡内余额" + getMoney());
        } else {
            System.out.println("余额不足,请及时充值!!!");
        }
    }
}
