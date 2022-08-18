package com.zechuan.nimingneibulei2;

public class Demo {
    public static void main(String[] args) {
        new Swim() {
            @Override
            public void swim() {
                System.out.println("游泳中");
            }
        }.swim();
    }
}
