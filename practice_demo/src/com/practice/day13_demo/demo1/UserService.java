package com.practice.day13_demo.demo1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 定义一个UserService类，并且在类中写几个方法，并且将MyTest注解贴在方法上
 */
public class UserService {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //需求:编写代码识别下面方法上是否有MyTest注解,如果有就让它执行;否则就不执行
        //获取UserService类的字节码
        Class<?> clazz = Class.forName("com.practice.day13_demo.demo1.UserService");

        Object obj = clazz.getConstructor().newInstance();

        //获取类中的所有方法
        Method[] methods = clazz.getDeclaredMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(MyTest.class)) {
                method.invoke(obj);
            }
        }
    }

    @MyTest
    public void addUser() {
        System.out.println("添加用户");
    }

    @MyTest
    public void deleteUser() {
        System.out.println("删除用户");
    }

    public void selectUser() {
        System.out.println("查询用户");
    }
}
