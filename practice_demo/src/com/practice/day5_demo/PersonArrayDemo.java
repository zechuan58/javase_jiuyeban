package com.practice.day5_demo;

import java.util.ArrayList;
/*
- 需求 : 自定义人类:包含姓名,年龄,身高属性.私有成员变量,生成无参,有参构造方法,生成get/set方法
- 创建5个人放到ArrayList 中，找出最高的人，最矮的人并输出最高人和最矮人的信息
 */
public class PersonArrayDemo {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("小明", 25, 180));
        list.add(new Person("小刚", 24, 179));
        list.add(new Person("小强", 23, 178));
        list.add(new Person("小志", 22, 177));
        list.add(new Person("小李", 21, 176));

        //最高
        Person high = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            Person person = list.get(i);
            if (high.getHigh() < person.getHigh()) {
                high = person;
            }
        }
        //最矮
        Person score = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            Person person = list.get(i);
            if (score.getHigh() > person.getHigh()) {
                score = person;
            }
        }
        System.out.println("最高的人:" + high);
        System.out.println("最矮的人:" + score);
    }
}
