package com.zechuan.lambda2;

/*
Lambda无参无返回值
 */
public class EatableDemo {
    public static void main(String[] args) {
        //在主方法中调用useEatable方法
        //匿名内部类
        useEatable(new Eatable() {
            @Override
            public void eat() {
                System.out.println("吃苹果");
            }
        });

        //Lambda表达式
        useEatable(() -> System.out.println("再吃一个"));
    }

    public static void useEatable(Eatable e) {
        e.eat();
    }
}
