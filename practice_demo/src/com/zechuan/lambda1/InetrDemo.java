package com.zechuan.lambda1;

public class InetrDemo {
    public static void main(String[] args) {

        //匿名内部类实现
        useInter(new Inter() {
            @Override
            public void show() {
                System.out.println("匿名内部类实现");
            }
        });

        //Lambda表达式实现
        useInter(() -> System.out.println("Lambda表达式实现"));
    }

    public static void useInter(Inter i) {
        i.show();
    }
}
