package com.itheima.d5_lamdba;


public class Demo2 {
    public static void main(String[] args) {

        method(new Swimming() {
            @Override
            public void swim(String str) {
                System.out.println("泳姿是:"+str);
            }
        });

        //lambda表达式
        method((String str) -> {
            System.out.println("泳姿是:"+str);
        });

        //lambda表达式简化格式
        method(str -> System.out.println("泳姿是:" + str));
    }
    public static void method(Swimming sw){
        sw.swim("仰泳");
    }
}
