package com.itheima.d6_regex;

/*
正则表达式： 专门用于对用户录入的字符串进行校验
校验qq号码是否正确：
    1)必须是6到20位
    2)纯数字组成
 */
public class Demo1 {
    public static void main(String[] args) {
        String qq="1195948307";
        boolean b = qq.matches("[0-9]{6,20}");
        System.out.println(b);
    }

    public static void checkQQ(String qq){

    }
}
