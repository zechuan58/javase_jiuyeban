package com.practice.day13_demo.demo2;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/*
需求:使用反射+配置文件编写一个框架,能够运行任意类的任意方法。
分析思路:
1)编写一个配置文件,在配置文件中去配置要运行的类和方法。
文件格式: .properties文件,内容是以"键=值"的形式出现的
2)读取配置文件,获取要运行的类名、和方法名
3)通过反射获取类名对应的字节码
4)通过反射获取要运行的方法
5)把方法执行起来
 */
public class Demo1 {
    private static String classname = null;
    private static String methodname =null;

    static {
        try {
            Properties prop = new Properties();
            prop.load(new FileReader("D:\\JavaDemo2\\javase_jiuyeban\\practice_demo\\src\\com\\practice\\day13_demo\\demo2\\config.properties"));

            //根据键获取值(获取类名)
            classname = prop.getProperty("classname");
            //根据键获取值(获取方法名)
            methodname = prop.getProperty("methodname");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> clazz = Class.forName(classname);

        //通过反射获取要运行的方法
        Method m = clazz.getMethod(methodname);

        //执行方法
        //创建对象
        Object obj = clazz.getConstructor().newInstance();
        m.invoke(obj);
    }
}
