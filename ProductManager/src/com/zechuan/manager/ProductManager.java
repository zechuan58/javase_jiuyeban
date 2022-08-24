package com.zechuan.manager;

import com.zechuan.domian.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

public class ProductManager {

    //定义一个日志记录器对象,方便后面记录日志
    public static final Logger LOGGER = LoggerFactory.getLogger(ProductManager.class);

    //新建一个集合,用来存储店铺和商品信息
    //键:String 店铺名称
    //值:ArrayList<Product>店铺中存储的商品
    public static HashMap<String, ArrayList<Product>> map = new HashMap<>();

    static {
        //在这里初始化一些店铺和商品信息
        //一个店铺中,可以有许多商品
        ArrayList<Product> list1 = new ArrayList<>();
        list1.add(new Product("育发膏", 9.9, 100, "日用品", "头发茂密", new Date()));
        list1.add(new Product("防脱液", 10.9, 10, "日用品", "稳固头发,不脱落", new Date()));

        ArrayList<Product> list2 = new ArrayList<>();
        list2.add(new Product("Java从入门到放弃", 50, 10, "图书", "学Java掉头发", new Date()));
        list2.add(new Product("MySQL删库跑路指南", 99, 5, "图书", "删库跑路不迷路", new Date()));

        //把图书列表添加到各个店铺
        map.put("泽川日化专营店", list1);
        map.put("泽川图书专营店", list2);

    }

    public static void main(String[] args) {

        while (true) {
            System.out.println("=============商城系统============");
            System.out.println("1.查看所有商品信息");
            System.out.println("2.上架商品");
            System.out.println("3.下架商品");
            System.out.println("4.按名称修改商品");
            System.out.println("5.按名称查询商品");
            System.out.println("6.退出系统");
            System.out.println("请输入你的选择:");

            //键盘录入操作指令
            Scanner sc = new Scanner(System.in);
            String command = sc.next();

            switch (command) {
                case "1" -> {
                    LOGGER.debug("查看所有商品信息操作");
                    findAllProduct();//调用查询方法
                }
                case "2" -> {
                    LOGGER.debug("上架商品操作");
                    addProduct();
                }
                case "3" -> {
                    LOGGER.debug("下架商品操作");
                    removeProduct();
                }
                case "4" -> {
                    LOGGER.debug("按照名称修改商品操作");
                    revampProduct();
                }
                case "5" -> {
                    LOGGER.debug("按照名称查询商品操作");
                    nameResolution();
                }
                case "6" -> {
                    LOGGER.debug("退出系统操作");
                    System.exit(0);//退出虚拟机
                }
                default -> LOGGER.debug("录入了一个错误的指令");
            }
        }
    }

    //按照名称查询商品操作
    private static void nameResolution() {

        //1.根据商品名称查询
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入商品名称：");
        String name = sc.next();


        ArrayList<String> list = new ArrayList<>();
        map.forEach((s, products) -> {
            products.forEach(product -> {
                if (product.getName().equals(name)) {
                    list.add("店铺名称:" + s);
                    list.add("\t商品名称:" + product.getName());
                    list.add("\t商品价格:" + product.getPrice());
                    list.add("\t商品类型:" + product.getType());
                    list.add("\t商品库存:" + product.getStock());
                    list.add("\t商品描述:" + product.getDesc());
                    list.add("\t商品上架时间:" + product.getCreateTime());
                }
            });
        });
        if (list.isEmpty()) {
            System.out.println("查无此商品");
        } else {
            list.forEach(s -> System.out.println(s));
        }
    }


    //修改商品
    private static void revampProduct() {
        lo1:
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("需要修改商品的店铺名称:");
            String shopName = sc.next();
            //判断店铺是否存在
            if (map.containsKey(shopName)) {
                //店铺存在:获取店铺的商品列表,从商品列表中删除指定名称的商品
                ArrayList<Product> list = map.get(shopName);
                while (true) {
                    //录入要修改的商品名称
                    System.out.println("要修改的商品名称:");
                    String productName = sc.next();
                    //修改list集合中名称为productName的商品
                    boolean b = list.removeIf(product -> product.getName().equals(productName));
                    if (b) {
                        //3.往list集合中添加商品对象
                        Product p = new Product();

                        //3.1键盘录入商品信息(名称),设置到商品对象中
                        System.out.println("修改的商品名称为:");
                        String name = sc.next();
                        p.setName(name);

                        //3.2键盘录入商品信息(价格),设置到商品对象中
                        while (true) {
                            try {
                                System.out.println("修改的商品价格为:");
                                Scanner sc1 = new Scanner(System.in);
                                double price = sc1.nextDouble();
                                if (price >= 0) {
                                    p.setPrice(price);
                                    break;
                                } else {
                                    System.out.println("价格不能为负数!请重新输入!");
                                }
                            } catch (Exception e) {
                                System.out.println("你录入的价格,格式不对!!!");
                            }
                        }

                        //3.3键盘录入商品信息(库存),设置到商品对象中
                        while (true) {
                            try {
                                System.out.println("修改的商品库存为:");
                                Scanner sc1 = new Scanner(System.in);
                                int stock = sc1.nextInt();
                                if (stock >= 0) {
                                    p.setStock(stock);
                                    break;
                                } else {
                                    System.out.println("库存不能为负数!请重新输入!");
                                }
                            } catch (Exception e) {
                                System.out.println("你录入的库存,格式不对!!!");
                            }
                        }

                        //3.4键盘录入商品信息(类型),设置到商品对象中
                        System.out.println("要修改的商品类型为:");
                        String type = sc.next();
                        p.setType(type);

                        //3.5键盘录入商品信息(描述),设置到商品对象中
                        System.out.println("要修改的商品描述为:");
                        String desc = sc.next();
                        p.setDesc(desc);

                        //商品的修改时间(当前系统时间)
                        p.setCreateTime(new Date());

                        //把商品对象添加到list集合中
                        list.add(p);
                        System.out.println("修改成功");

                        break lo1;
                    } else {
                        System.out.println("要修改的商品不存在,请验证后输入!");
                    }
                }
            } else {
                System.out.println("店铺不存在,请验证后重新输入店铺名称!");
            }
        }


    }

    //下架商品
    private static void removeProduct() {
        lo:
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("需要下架商品的店铺名称:");
            String shopName = sc.next();

            //判断店铺是否存在
            if (map.containsKey(shopName)) {
                //店铺存在:获取店铺的商品列表,从商品列表中删除指定名称的商品
                ArrayList<Product> list = map.get(shopName);

                while (true) {
                    //录入要下架的商品名称
                    System.out.println("要下架的商品名称:");
                    String productName = sc.next();
                    //删除list集合中名称为productName的商品
                    boolean b = list.removeIf(product -> product.getName().equals(productName));
                    if (b) {
                        System.out.println("下架成功!");
                        break lo;
                    } else {
                        System.out.println("要删除的商品不存在,请验证后输入!");
                    }
                }
            } else {
                System.out.println("店铺不存在,请验证后重新输入店铺名称!");
            }
        }
    }

    //上架商品
    private static void addProduct() {
        //1.录入店铺名称
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要上架的店铺名称:");
        String shopName = sc.next();

        //2.判断录入的店铺在map集合中是否存在
        ArrayList<Product> list;
        if (map.containsKey(shopName)) {
            //店铺存在:从map集合中获取店铺对应的集合(商品列表)
            list = map.get(shopName);
        } else {
            //店铺不存在:创建一个新的集合,加入map中
            list = new ArrayList<>();
            map.put(shopName, list);
        }


        //3.往list集合中添加商品对象
        Product p = new Product();
        //3.1键盘录入商品信息(名称),设置到商品对象中
        System.out.println("要添加的商品名称:");
        String name = sc.next();
        p.setName(name);

        //3.2键盘录入商品信息(价格),设置到商品对象中
        while (true) {
            try {
                System.out.println("要添加的商品价格:");
                Scanner sc1 = new Scanner(System.in);
                double price = sc1.nextDouble();
                if (price >= 0) {
                    p.setPrice(price);
                    break;
                } else {
                    System.out.println("价格不能为负数!请重新输入!");
                }
            } catch (Exception e) {
                System.out.println("你录入的价格,格式不对!!!");
            }
        }

        //3.3键盘录入商品信息(库存),设置到商品对象中
        while (true) {
            try {
                System.out.println("要添加的商品库存:");
                Scanner sc1 = new Scanner(System.in);
                int stock = sc1.nextInt();
                if (stock >= 0) {
                    p.setStock(stock);
                    break;
                } else {
                    System.out.println("库存不能为负数!请重新输入!");
                }
            } catch (Exception e) {
                System.out.println("你录入的库存,格式不对!!!");
            }
        }

        //3.4键盘录入商品信息(类型),设置到商品对象中
        System.out.println("要添加的商品类型:");
        String type = sc.next();
        p.setType(type);

        //3.5键盘录入商品信息(描述),设置到商品对象中
        System.out.println("要添加的商品描述:");
        String desc = sc.next();
        p.setDesc(desc);

        //商品的上架时间(当前系统时间)
        p.setCreateTime(new Date());

        //把商品对象添加到list集合中
        list.add(p);
        System.out.println("上架成功");
    }

    //查看所有商品
    private static void findAllProduct() {
        //key:店铺名称
        //value:店铺里面的商品列表,是一个ArrayList集合
        map.forEach((key, value) -> {
            System.out.println("店铺名称:" + key);
            for (Product product : value) {
                System.out.println("\t商品名称:" + product.getName());
                System.out.println("\t商品价格:" + product.getPrice());
                System.out.println("\t商品库存:" + product.getStock());
                System.out.println("\t商品类型:" + product.getType());
                System.out.println("\t商品介绍:" + product.getDesc());
                System.out.println("\t创建时间:" + product.getCreateTime());
                System.out.println("---------------------");
            }
        });
    }
}
