package com.itheima.d3_reflect_constructor;

import org.junit.Test;

import java.lang.reflect.Constructor;


/**
    目标：获取Class对象中的构造器对象，并使用。（清楚它的API）
 */
public class ReflectDemo1 {
    //获取多个的构造方法
    @Test
    public void getAllConstructors() throws ClassNotFoundException {
        //第一步:获取类的字节码
        Class<?> clazz = Class.forName("com.itheima.d3_reflect_constructor.Student");
        //第二步:获取构造方法对象
        //获取所有的公有,私有的构造
        Constructor<?>[] cons = clazz.getDeclaredConstructors();
        for (Constructor<?> con : cons) {
            System.out.println(con);
        }
    }

    //获取一个构造方法
    @Test
    public void getConstructor() throws Exception {
        //第一步:获取类的字节码
        Class<?> clazz = Class.forName("com.itheima.d3_reflect_constructor.Student");
        Constructor<?> cons2 = clazz.getDeclaredConstructor();
        System.out.println(cons2);
    }

    //通过构造方法创建对象
    @Test
    public void createObj() throws Exception {
        //第一步:获取类的字节码
        Class<?> clazz = Class.forName("com.itheima.d3_reflect_constructor.Student");

        //第二步:
        //1.获取有两个参数的构造方法,参数分别为String和int
        Constructor<?> con1 = clazz.getConstructor(String.class, int.class);
        //室友con1构造方法创建对象  等价于:new Student
        Object obj1 = con1.newInstance("小明", 20);
        System.out.println(obj1);

        //2.获取空参构造,而且是private修饰
        Constructor<?> con2 = clazz.getDeclaredConstructor();
        con2.setAccessible(true);
        Object obj2 = con2.newInstance();
        System.out.println(obj2);
    }
}
