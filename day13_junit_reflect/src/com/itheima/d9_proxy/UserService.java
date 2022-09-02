package com.itheima.d9_proxy;

/**
    动态代理需要接口配合。
 */
public interface UserService {
    String login(String loginName, String passWord);
    void selectUsers();
    void deleteUsers();
}
