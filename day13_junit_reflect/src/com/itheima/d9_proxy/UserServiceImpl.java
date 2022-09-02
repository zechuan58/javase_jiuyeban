package com.itheima.d9_proxy;

/**
    实现类（时间性能分析）
 */
public class UserServiceImpl implements UserService{

    @Override
    public String login(String loginName, String passWord) {
        String result = "登录失败的";
        if("admin".equals(loginName) && "1234".equals(passWord)){
            result = "登录成功";
        }
        return result;
    }

    @Override
    public void selectUsers() {
        System.out.println("查询1000个用户进行中。。。");
    }

    @Override
    public void deleteUsers() {
        System.out.println("删除1000个用户进行中。。。");
    }
}
