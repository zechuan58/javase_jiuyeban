package com.itheima.d3_static.demo4;

public class demo4 {
    public static void main(String[] args) {
        Programmer p = new Programmer();
        p.setName("张三");
        p.setAge(20);
        p.setDivision("研发部");
        p.work();
        System.out.println("-----------");


        ProductManager pm = new ProductManager("李四", 25, "产品部");
        pm.work();
    }
}
