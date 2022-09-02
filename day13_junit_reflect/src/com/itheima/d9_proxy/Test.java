package com.itheima.d9_proxy;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/*
动态代理
 */
public class Test {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        //为UserServiceImpl对象生成代理对象
        UserService proxy = getProxy(userService);
        //使用代理对象调用方法
        String result = proxy.login("admin", "1234");
        System.out.println(result);

        proxy.selectUsers();
        proxy.deleteUsers();
    }

    /**
     * 为UserService接口的实现类对象,生成代理对象
     * @param f 目标对象
     * @return 返回代理对象
     */
    public static UserService getProxy(UserService f) {
        /**
         * 参数1:类加载类,用于把类加载到内存
         * 参数2:实现类实现的接口
         * 参数3:对实现类的对象进行功能增强的处理方式
         */
        UserService proxy = (UserService) Proxy.newProxyInstance(
                UserService.class.getClassLoader(),
                new Class[]{UserService.class},
                new InvocationHandler() {
                    /**
                     *
                     * @param proxy 代理对象
                     * @param method 需要执行的目标方法
                     * @param args 目标方法执行的实际参数
                     * @return 返回目标方法执行的结果
                     */
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        //执行目标方法之前，多做的事情（功能增强）
                        long time1 = System.currentTimeMillis();
                        //执行目标方法
                        Object result = method.invoke(f, args);
                        //执行目标方法之后，多做的事情（功能增强）
                        long time2 = System.currentTimeMillis();
                        System.out.println(method.getName() + "方法耗时" + (time2 - time1));
                        return result;
                    }
                });
        //返回代理对象
        return proxy;
    }
}
