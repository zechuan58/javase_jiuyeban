package com.itheima.homework.demo02;

/*
人类
 */
public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //行为
    public void KeepPet(Dog dog,String something){
        dog.eat(something);
    }

    public void KeepPet(Cat cat,String something){
        cat.eat(something);
        }
}
