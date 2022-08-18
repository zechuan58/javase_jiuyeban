package com.zechuan.lambda3;

/*
Lambda带参无返回值
 */
public class FlyableDemo {
    public static void main(String[] args) {
        //匿名内部类
        useFlyable(new Flyable() {
            @Override
            public void fly(String s) {
                System.out.println(s + ", 匿名");
                System.out.println("嗨嗨");
            }
        });
        //Lambda表达式
        useFlyable(s -> {
            System.out.println(s + ", Lambda");
            System.out.println("嗨害嗨");
        });
    }

    public static void useFlyable(Flyable f) {
        f.fly("吃个苹果");
    }
}
