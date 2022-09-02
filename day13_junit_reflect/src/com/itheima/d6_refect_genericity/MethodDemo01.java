package com.itheima.d6_refect_genericity;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
    目标：反射的应用-绕过编译阶段。
 */
public class MethodDemo01 {
    public static void main(String[] args) throws Exception {
        List<Integer> ages = new ArrayList<>();
        ages.add(23);
        ages.add(34);

        //获取ages的字节码
        Class clazz = ages.getClass();
        Method m = clazz.getMethod("add", Object.class);
        m.invoke(ages,true);
        m.invoke(ages,"小明");
        m.invoke(ages,25);
        m.invoke(ages,'a');
        System.out.println(ages);
    }
}