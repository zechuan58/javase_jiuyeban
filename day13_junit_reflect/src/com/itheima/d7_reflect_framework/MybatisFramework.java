package com.itheima.d7_reflect_framework;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;

/**
 * 通用框架: 能够将任何对象的属性和属性值，写到文件中去。
 */
public class MybatisFramework {


    /**
     * 把任意对象的字段和其值存入到文件中去。
     *
     * @param obj
     */
    public static void save(Object obj) throws IOException, IllegalAccessException {
        //创建BufferedWriter流对象,用来往文件中写文本类型的数据
        BufferedWriter bw = new BufferedWriter(new FileWriter("day13_junit_reflect\\a.txt", true));

        //先获取obj对象的字节码
        Class<?> clazz = obj.getClass();

        //写类名
        bw.write("========" + clazz.getSimpleName() + "========");
        bw.newLine();
        bw.flush();

        //获取类中的所有成员方法
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            //暴力反射
            field.setAccessible(true);
            //获取成员变量的名称
            String name = field.getName();
            //获取成员变量的值
            Object value = field.get(obj);
            //把成员变量的名称name和成员变量的值value写到文件中去
            bw.write(name + "=" + value);
            bw.newLine();
            bw.flush();


        }
    }
}
