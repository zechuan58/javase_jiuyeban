package com.itheima.d3_abstract.demo2;

/*
需求：某加油站推出了2种支付卡，一种是预存10000的金卡，后续加油享受8折优惠，另一种是预存5000的银卡 ,后续加油享受8.5折优惠。
请分别实现2种卡片进入收银系统后的逻辑，卡片需要包含主人姓名，余额，支付功能。
 */
public class Demo2 {
    public static void main(String[] args) {
        //创建金卡对象
        GoldCard gd = new GoldCard("王先生", 10000);
        //金卡消费
        gd.pay(1000);

        //创建银卡对象
        SilverCard sd=new SilverCard("李先生",5000);
        sd.pay(1000);
    }
}
