package com.itheima.d5_polymorphic.demo2;

/*
需求：写一个方法，要求方法的参数既能传递猫的对象，也能传递狗的对象。
 */
public class Demo2 {
    public static void main(String[] args) {
        //创建狗对象
        Dog dog = new Dog();
        //类名.方法名调用
        Feeder.feed(dog);

        //创建猫对象
        Cat cat = new Cat();
        Feeder.feed(cat);
    }
}
