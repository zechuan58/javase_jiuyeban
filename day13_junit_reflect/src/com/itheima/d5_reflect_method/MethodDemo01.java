package com.itheima.d5_reflect_method;

import org.junit.Test;

import java.lang.reflect.Method;

/**
 * 目标：反射——获取Method方法对象
 * <p>
 * 反射获取类的Method方法对象：
 * 1、Method getMethod(String name,Class...args);
 * 根据方法名和参数类型获得对应的方法对象，只能获得public的
 * <p>
 * 2、Method getDeclaredMethod(String name,Class...args);
 * 根据方法名和参数类型获得对应的方法对象，包括private的
 * <p>
 * 3、Method[] getMethods();
 * 获得类中的所有成员方法对象，返回数组，只能获得public修饰的且包含父类的
 * <p>
 * 4、Method[] getDeclaredMethods();
 * 获得类中的所有成员方法对象，返回数组,只获得本类申明的方法。
 * <p>
 * Method的方法执行：
 * Object invoke(Object obj, Object... args)
 * 参数一：触发的是哪个对象的方法执行。
 * 参数二： args：调用方法时传递的实际参数
 */
public class MethodDemo01 {
    /**
     * 1.获得类中的所有成员方法对象
     */
    @Test
    public void getDeclaredMethods() throws ClassNotFoundException {
        //获取类的字节码
        Class<?> clazz = Class.forName("com.itheima.d5_reflect_method.Dog");
        //获取类的成员方法
        //1.获取所有公有成员方法(可以获取到本类和父类的方法)
        /*Method[] methods1 = clazz.getMethods();
        for (Method method : methods1) {
            System.out.println(method);
        }*/

        //2.获取所有公有,私有的成员方法(只能获取本类的方法)
        Method[] methods2 = clazz.getDeclaredMethods();
        for (Method method : methods2) {
            System.out.println(method);
        }

    }

    /**
     * 2. 获取某个方法对象
     */
    @Test
    public void getDeclardMethod() throws Exception {
        //获取类的字节码
        Class<?> clazz = Class.forName("com.itheima.d5_reflect_method.Dog");


        //创建Dog类的对象
        Object obj1 = clazz.getConstructor().newInstance();

        //第二步:获取单个成员方法
        //获取run方法,public修饰,无参数
        Method m1 = clazz.getMethod("run");
        m1.invoke(obj1);

        //获取eat方法,private修饰,无参数
        Method m2 = clazz.getDeclaredMethod("eat");
        //暴力反射
        m2.setAccessible(true);
        m2.invoke(obj1);


        //获取eat方法,private修饰,参数是String类型
        Method m3 = clazz.getDeclaredMethod("eat",String.class);
        m3.setAccessible(true);
        Object result = m3.invoke(obj1, "狗粮");
        System.out.println(result);
    }
}