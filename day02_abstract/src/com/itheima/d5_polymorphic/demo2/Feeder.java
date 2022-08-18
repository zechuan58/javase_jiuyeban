package com.itheima.d5_polymorphic.demo2;

/*
饲养员类:
 */
public class Feeder {
    //static目的是为了方便调用
    public static void feed(Animal a) {
        a.eat();

        if (a instanceof Dog) {
            Dog dog = (Dog) a;
            dog.swimming();
        }

        if (a instanceof Cat){
            Cat cat = (Cat) a;
            cat.catchMouse();
        }
    }
}
