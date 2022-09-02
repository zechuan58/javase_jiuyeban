package com.itheima.d2_reflect;

/**
    目标：反射第一步：获取Class对象
 */
public class ReflectDemo1 {
    public static void main(String[] args) throws Exception {
        // 1.Class下的静态方法forName(..)
        Class clazz1 = Class.forName("com.itheima.d2_reflect.Student");

        // 2.类名.class
        Class clazz2 = Student.class;

        // 3.对象获取Class对象
        Student s = new Student();
        Class clazz3 = s.getClass();


        // 4.获取全类名
        String name=clazz1.getName();
        System.out.println(name);

        //获取类名
        String simpleName = clazz1.getSimpleName();
        System.out.println(simpleName);
    }
}
