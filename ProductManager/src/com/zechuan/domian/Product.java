package com.zechuan.domian;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Product {
    private String name; //商品名称
    private double price; //商品价格
    private int stock; //商品库存
    private String type; //商品类型
    private String desc; //商品描述
    private Date createTime; //上架时间

    public Product() {
    }

    public Product(String name, double price, int stock, String type, String desc, Date createTime) {
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.type = type;
        this.desc = desc;
        this.createTime = createTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getCreateTime() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss a E");
        String str = sdf.format(createTime);
        return str;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", stock=" + stock +
                ", type='" + type + '\'' +
                ", desc='" + desc + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}
