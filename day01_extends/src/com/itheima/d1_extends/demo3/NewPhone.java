package com.itheima.d1_extends.demo3;

/*
 * 新手机需要用到手机的功能,所以可以让新手机(NewPhone)继承老手机(Phone)
 * 新手机打电话和发短信的同时,还需要有自己的特有功能,所以可以用到方法重写
 */
public class NewPhone extends Phone {
    //打电话
    @Override
    public void call(){
        super.call();
        System.out.println("手机视频通话");
    }
    //发短信
    @Override
    public void sendMessage(){
        //发短信的同时还可以发彩信
        super.sendMessage();
        System.out.println("手机发彩信");
    }
}
