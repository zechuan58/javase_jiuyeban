package com.itheima.d4_test;
/*
扑克类:用于描述扑克的属性信息
    属性;花色、点数
 */
public class Poker {
    private String color;//花色
    private String num;//点数
    private int order; //序号


    public Poker() {
    }

    public Poker(String color, String num, int order) {
        this.color = color;
        this.num = num;
        this.order = order;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    @Override
    public String toString() {
        if (color==null){
            return num;
        }
        return color+num;
    }
}
