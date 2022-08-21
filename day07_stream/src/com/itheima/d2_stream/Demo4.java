package com.itheima.d2_stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

/*
Stream流的常用API

Stream流注意事项:
1)Stream流调用完方法之后, Stream流就已经被关闭,就不能再调用其他方法了。
2)Stream流对元素进行操作,对集合本身没有影响
 */
public class Demo4 {
    public static void main(String[] args) {
        //准备2个集合
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        //分别给两个集合添加元素
        Collections.addAll(list1, "林冲", "鲁智深", "张青", "孙二娘", "武松", "武大郎", "潘金莲", "西门庆", "潘金莲");
        Collections.addAll(list2, "张无忌", "张三丰", "周芷若", "乔峰", "杨过", "小龙女", "尹志平");

        //获取list1和list2集合的流
        Stream<String> stream1 = list1.stream();
        Stream<String> stream2 = list2.stream();

        //把stream1和stream2两个流合并为一个流
        Stream<String> stream3 = Stream.concat(stream1, stream2);

        //对流中的元素去重、再截取前面的18个元素,再跳过前面的2个元素,再过滤流中长度为3的元素
        stream3
                .distinct()//去重
                .limit(10)//截取前面10个
                .skip(2)//跳过前面2个
                .filter(s -> s.length() == 3)//过滤长度为3的元素
                .forEach(s -> System.out.println(s));//遍历打印
    }
}
