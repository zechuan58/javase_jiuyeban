package com.itheima.homework.demo02;

/*
测试类
 */
public class Test02 {
    public static void main(String[] args) {
        //创建人的对象
        Person p = new Person();

        //创建狗对象
        Dog dog = new Dog(2, "黑色");
        p.KeepPet(dog, "骨头");

        //创建猫对象
        Cat cat = new Cat(2, "白色");
        p.KeepPet(cat, "小鱼干");
    }

}
