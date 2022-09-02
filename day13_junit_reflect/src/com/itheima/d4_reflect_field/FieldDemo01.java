package com.itheima.d4_reflect_field;

import org.junit.Test;

import java.io.File;
import java.lang.reflect.Field;

/**
     目标：反射_获取Field成员变量对象。

     反射的第一步是先得到Class类对象。

     1、Field getField(String name);
            根据成员变量名获得对应Field对象，只能获得public修饰
     2.Field getDeclaredField(String name);
            根据成员变量名获得对应Field对象，只要申明了就可以得到
     3.Field[] getFields();
            获得所有的成员变量对应的Field对象，只能获得public的
     4.Field[] getDeclaredFields();
            获得所有的成员变量对应的Field对象，只要申明了就可以得到
     小结：
        获取全部成员变量：getDeclaredFields
        获取某个成员变量：getDeclaredField
 */
public class FieldDemo01 {

    @Test
    public void getDeclaredFields() throws ClassNotFoundException {
        Class<?> clazz1 = Class.forName("com.itheima.d4_reflect_field.Student");


        //获取成员变量
        //获取所有的公有成员变量
        Field[] fields = clazz1.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }

        System.out.println("--------");
        //获取所有的公有,私有成员变量
        Field[] fields2 = clazz1.getDeclaredFields();
        for (Field field : fields2) {
            System.out.println(field);
        }
    }

    @Test
    public void getDeclaredField() throws Exception {
        Class<?> clazz = Class.forName("com.itheima.d4_reflect_field.Student");

        //第二步:获取单个成员对象
        //获取单个私有成员变量

    }


    @Test
    public void setField() throws Exception {
        Class<?> clazz = Class.forName("com.itheima.d4_reflect_field.Student");

        //创建学生类的对象
        Object obj = clazz.getConstructor().newInstance();

        //第二步:获取单个成员变量
        //获取单个私有成员变量
        Field f1 = clazz.getDeclaredField("age");
        //暴力反射
        f1.setAccessible(true);
        //给f1变量设置值
        f1.set(obj,18);//等价于obj.setAge(18)
        //获取f1变量的值
        Object value1 = f1.get(obj);
        System.out.println(value1);


        //获取单个公有成员变量
        Field f2 = clazz.getField("schoolName");
        f2.set(obj,"传智播客");//等价于obj.setSchoolName()
        Object value2 = f2.get(obj);//等价于obj.getSchoolName();
        System.out.println(value2);
    }

}


