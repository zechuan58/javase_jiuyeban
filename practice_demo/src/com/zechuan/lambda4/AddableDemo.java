package com.zechuan.lambda4;

/*
    Lambda带参有返回值

    Lambda表达式的格式: (形式参数)-> {代码块}

    练习3:
        1:定义一个接口(Addable),里面定义一个抽象方法: int add(int x,int y);
        2:定义一个测试类(AddableDemo),在测试类中提供两个方法
            一个方法是: useAddable (Addable a)
            一个方法是主方法,在主方法中调用useAddable方法
 */
public class AddableDemo {
    public static void main(String[] args) {
        //在主方法中调用useAddable方法
        //匿名内部类
        useAddable(new Addable() {
            @Override
            public int add(int x, int y) {
                return x - y;
            }
        });

        //Lambda表达式
        useAddable((x, y) -> x + y);
    }

    public static void useAddable(Addable a) {
        int sum = a.add(10, 20);
        System.out.println(sum);
    }
}
