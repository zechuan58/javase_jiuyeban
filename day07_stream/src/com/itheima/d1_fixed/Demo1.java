package com.itheima.d1_fixed;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Demo1 {
    public static void main(String[] args) {
        //获取List的不可变集合
        List<String> list = List.of("你好", "世界", "爪哇");
        System.out.println(list);

        //获取Set的不可变集合,要求元素不能重复
        Set<Integer> set = Set.of(100, 200, 300);
        System.out.println(set);

        //获取Map的不可变集合
        Map<String, Integer> map = Map.of("张三", 18, "李四", 17, "王五", 20);
        System.out.println(map);
    }

}
