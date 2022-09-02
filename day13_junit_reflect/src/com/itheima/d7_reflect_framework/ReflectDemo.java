package com.itheima.d7_reflect_framework;

import java.io.IOException;

/**
 * 目标：提供一个通用框架，支持保存所有对象的具体信息。
 */
public class ReflectDemo {
    public static void main(String[] args) throws IOException, IllegalAccessException {
        Student s1 = new Student("张三", '男', 23, "Java152期", "唱跳 rap 篮球");
        MybatisFramework.save(s1);

        Teacher t1 = new Teacher("小李", '男', 20000);
        MybatisFramework.save(t1);
    }
}
