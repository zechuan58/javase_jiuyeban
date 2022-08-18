package com.itheima.d3_abstract.demo2;
/*
卡片类:用来描述卡片的属性和行为
      属性:姓名和余额
      行为:支付
 */
public abstract class Card {
    private String name;//姓名
    private double money;//余额

    public Card() {
    }

    public Card(String name, double money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    //支付的行为
    public abstract void pay(int money);
}
