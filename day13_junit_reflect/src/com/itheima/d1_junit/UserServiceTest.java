package com.itheima.d1_junit;

import org.junit.Assert;
import org.junit.Test;

public class UserServiceTest {

    //测试Login方法
    @Test
    public void loginTest() {
        UserService userService = new UserService();
        String result = userService.login("admin", "123456");
        //验证result和预期的结果是否相符
        Assert.assertEquals("登录成功", result);
    }

    @Test
    public void chuTest() {
        UserService userService = new UserService();
        userService.chu();
    }
}
