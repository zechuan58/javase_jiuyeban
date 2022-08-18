package com.itheima.d3_static.demo3;

import java.util.Random;

/*
生成验证码的工具类
 */
public class CreateCheckUtils {
    //把构造方法私有化,目的是为了防止别人创建对象
    private CreateCheckUtils() {

    }

    /**
     * 用于生成4位字符组成的验证码方法
     *
     * @return 返回验证码
     */
    public static String createCheckCode() {
        String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

        String code = "";//验证码

        for (int i = 0; i < 4; i++) {
            Random r = new Random();
            int index = r.nextInt(str.length());
            char ch = str.charAt(index);
            code += ch;
        }
        //最终把code返回
        return code;
    }
}
