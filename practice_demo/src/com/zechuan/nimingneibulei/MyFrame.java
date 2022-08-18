package com.zechuan.nimingneibulei;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame {
    public MyFrame(){
        //窗口初始化
        iniFrame();
        //绘制窗体
        paintView();
        //设置窗体可见
        this.setVisible(true);

    }
    public void paintView(){
        //创建按钮
        JButton jButton=new JButton("点击");
        jButton.setBounds(0,0,100,100);

        this.add(jButton);

        //给按钮添加事件   ActionListener是匿名内部类的实现对象
        jButton.addActionListener(new ActionListener() {
            int count=0;
            @Override
            public void actionPerformed(ActionEvent e) {
                count++;
                System.out.println("点击"+count+"次");
                if (count==10){
                    System.out.println("别点了,拜拜!");
                    System.exit(0);
                }
            }
        });
    }

    public void iniFrame(){
        this.setTitle("给按钮添加事件");
        this.setSize(200,200);
        this.setDefaultCloseOperation(3);
        this.setLocationRelativeTo(null);
        this.setAlwaysOnTop(true);
        this.setLayout(null);
    }
}
