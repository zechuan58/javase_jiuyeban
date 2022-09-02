package com.itheima.d1_junit;

public class UserService {

    public String login(String loginName, String passWord){
        if("admin".equals(loginName) && "123456".equals(passWord)){
            return "登录成功";
        }else {
            return "登录名和密码有问题";
        }
    }

    public void chu(){
        System.out.println(10/2);
    }
}
