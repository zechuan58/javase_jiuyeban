package com.itheima.d5_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
Map集合的遍历方式二： 直接找键值对
   第一步：调用entrySet方法，得到所有【键值对对象】，组成的Set集合
   第二步：遍历Set集合，获取每一个【键值对对象】
   第三步：获取每一个【键值对对象】的键和值
 */
public class Demo4 {
    public static void main(String[] args) {
        HashMap<String,String>map=new HashMap<>();
        map.put("陈奕迅","十年");
        map.put("周杰伦","稻香");
        map.put("林俊杰","浪漫血液");
        map.put("李荣浩","不搭");

        //调用entrySet方法
        Set<Map.Entry<String, String>> entrys = map.entrySet();
        //遍历set集合,获取每个Map.Entry对象 键值对 的对象
        for (Map.Entry<String, String> entry : entrys) {
            //获取键值对的键
            String key=entry.getKey();
            //获取键值对的值
            String value=entry.getValue();
            System.out.println(key+"..."+value);
        }
    }
}
