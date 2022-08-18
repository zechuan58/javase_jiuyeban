package com.itheima.d3_abstract.demo3;

/*
作文模板类
    要求:开头和结尾是固定的,中间正文不固定,正文不一样
        把开头和结尾写成普通方法
        正文:写成抽象方法
 */
public abstract class Template {
    public void begin() {
        System.out.println("作文开头!");
    }

    public abstract void body();

    public void end() {
        System.out.println("作文结尾!");
    }

    //写作文的方法,final修饰,不让重写
    public final void write() {
        begin();//开头
        body();//正文
        end();//结尾
    }
}
