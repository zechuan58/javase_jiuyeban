package com.practice.day13_demo.demo3;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@MyConfigration(classname = "com.practice.day13_demo.demo3.Dog", methodname = "eat")
public class Test3 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //1.获取本类的字节码
        Class<?> clazz = Class.forName("com.practice.day13_demo.demo3.Test3");

        //2.获取字节码上的MyConfigration注解
        MyConfigration mc = clazz.getDeclaredAnnotation(MyConfigration.class);

        //3.获取注解上的classname属性值，获取methodname属性值
        String classname = mc.classname();
        String methodname = mc.methodname();

        //4.使用反射技术，以classname的属性值获取类的字节码
        Class<?> clazz2 = Class.forName(classname);
        Object obj = clazz2.getConstructor().newInstance();

        //5.使用反射技术，以methodname的属性值获取方法对象
        Method method = clazz2.getDeclaredMethod(methodname);

        //6.执行刚刚获取的方法
        method.invoke(obj);
    }
}
