package com.itheima.d3_static.demo3;

public class Demo3 {
    public static void main(String[] args) {
        //模拟登录界面获取验证码
        String checkCode = CreateCheckUtils.createCheckCode();
        System.out.println(checkCode);

        //模拟注册界面获取验证码
        String checkCode1 = CreateCheckUtils.createCheckCode();
        System.out.println(checkCode1);
    }
}
