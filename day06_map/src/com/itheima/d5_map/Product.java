package com.itheima.d5_map;

/*
商品类：封装商品的信息
    名称、价格、数量
 */
public class Product {
    private String name;
    private int price;
    private int num;

    public Product() {
    }

    public Product(String name, int price, int num) {
        this.name = name;
        this.price = price;
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", num=" + num +
                '}';
    }
}
