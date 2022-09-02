package com.practice.day13_demo.demo3;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//限制注解只能用在类上
@Target(ElementType.TYPE)
//限制注解在运行阶段有效
@Retention(RetentionPolicy.RUNTIME)
public @interface MyConfigration {
    String classname(); //该属性值，表示要执行的类（类的全名）
    String methodname(); //该属性值，表示要执行的方法名
}