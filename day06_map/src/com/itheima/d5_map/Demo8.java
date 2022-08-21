package com.itheima.d5_map;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/*
集合嵌套： 集合存集合
    一个订单包含多件商品
    一个用户可以有多个订单
 */
public class Demo8 {
    public static void main(String[] args) {
        //创建HasMap集合,规定键:订单号,值:该订单对应的商品列表(由于有多个商品,所以用一个ArrayList集合表示)
        HashMap<String, ArrayList<Product>> map = new HashMap<>();


        //创建两个ArrayList集合,用来存储每个订单的商品
        ArrayList<Product> list1 = new ArrayList<>();
        list1.add(new Product("老母鸡", 50, 2));
        list1.add(new Product("拖把头", 9, 3));

        ArrayList<Product> list2 = new ArrayList<>();
        list2.add(new Product("耳机", 1000, 1));
        list2.add(new Product("电脑", 15000, 10));
        list2.add(new Product("手表", 2500, 3));

        //往集合中添加键和值
        map.put("001", list1);
        map.put("002", list2);

        //遍历集合
        Set<String> keys = map.keySet();
        for (String key : keys) {
            //key表示订单
            System.out.println("订单号" + key);
            //获取key对应的值(商品列表)
            ArrayList<Product> products = map.get(key);
            for (Product product : products) {
                System.out.println("\t" + product);
            }
        }
    }
}
