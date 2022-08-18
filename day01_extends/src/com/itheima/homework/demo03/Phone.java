package com.itheima.homework.demo03;

/*
手机类
 */
public class Phone {
    //属性
    private String brand;//品牌
    private int price;//价格
    private int size;//尺寸

    public Phone() {
    }

    public Phone(String brand, int price) {
        this(brand, price, 6);
    }

    public Phone(String brand, int price, int size) {
        this.brand = brand;
        this.price = price;
        this.size = size;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    //行为
    public void call() {//打电话
        System.out.println("打电话");
    }

    public void sendMessage() {//发短信
        System.out.println("发短信");
    }

    public void playGame() {//打游戏
        System.out.println("打游戏");
    }
}
