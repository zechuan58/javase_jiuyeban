package com.itheima.d2_stream;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

/*
需求：某个公司的开发部门，分为开发一部和二部，现在需要进行年中数据结算，
要求如下：
    ① 每个员工信息至少包含了(姓名、性别、工资、奖金、处罚记录)
    ② 开发一部有4个员工、开发二部有5名员工
    ③ 分别筛选出2个部门的最高收入的员工信息，封装成优秀员工对象Topperformer
          优秀员工包含：姓名和实际收入两个属性
    ④：分别统计出2个部门的平均月收入，要求去掉最高收入和最低收入。
    ⑤：统计2个开发部门整体的平均月收入，要求去掉最高收入和最低收入。

Stream流的方法：
    max: 求流中元素的最大值，需要指定比较器(告诉流按照什么进行比较)
         返回值是一个Optional对象，它是一个封装了Employee对象的容器
 */
public class Demo6 {
    public static void main(String[] args) {
        //开发一部4个员工，开发二部5个员工
        ArrayList<Employee> list1 = new ArrayList<>();
        list1.add(new Employee("孙悟空", "男", 20000, 5000, "大闹天宫"));
        list1.add(new Employee("猪八戒", "男", 15000, 3000, "调戏嫦娥"));
        list1.add(new Employee("沙和尚", "男", 13000, 2000, "打碎琉璃盏"));
        list1.add(new Employee("白龙马", "男", 10000, 300, "毁了夜明珠"));

        ArrayList<Employee> list2 = new ArrayList<>();
        list2.add(new Employee("武松", "男", 25000, 5000, "打死西门庆"));
        list2.add(new Employee("武大郎", "男", 16000, 3000, "喝药了"));
        list2.add(new Employee("潘金莲", "女", 10000, 3000, "红杏出墙"));
        list2.add(new Employee("西门庆", "男", 30000, 100, "图谋不轨"));
        list2.add(new Employee("林冲", "男", 25000, 6000, "谋权篡位"));

        //1.求开发部门一种最高收入的员工，再封装为Topperformer对象
        //获取收入最高的员工
        Optional<Employee> optional = list1.stream().max((o1, o2) -> o1.getMoney() - o2.getMoney() >= 0 ? 1 : -1);
        //从Optional容器中，获取员工
        Employee max = optional.get();
        //把收入最高的员工，再次封装为TopPerformer对象
        TopPerformer top1 = new TopPerformer(max.getName(), max.getMoney());
        System.out.println(top1);

        //2.求开发一部的平均月收入，去掉最高收入和最低收入
        double avg1 = list1.stream()
                .sorted((o1, o2) -> o1.getMoney() - o2.getMoney() >= 0 ? 1 : -1)//按照收入升序排列
                .skip(1)//跳过流中第一个元素(去掉收入最低)
                .limit(list1.size() - 2)//去掉最高收入
                .mapToDouble(s -> s.getMoney())
                .average()
                .getAsDouble();
        System.out.println("开发一部的平均收入:"+avg1);

        //3. 求两个部门整体的平均月收入，去掉最高收入和最低收入

        //把两个部门员工合并在一起
        Stream<Employee> stream3 = Stream.concat(list1.stream(), list2.stream());
        double avg2 = stream3
                .sorted((o1, o2) -> o1.getMoney() - o2.getMoney() >= 0 ? 1 : -1)//按照收入升序排列
                .skip(1)//跳过流中第一个元素(去掉收入最低)
                .limit((list1.size()+ list2.size()) - 2)//去掉最高收入
                .mapToDouble(s -> s.getMoney())//把流中的员工类型收入单独拿出来,变成一个新的流
                .average()//求平均值
                .getAsDouble();//获取平均值
        System.out.println("两个部们的平均收入:"+avg2);
        //stream3.forEach(employee -> System.out.println(employee));
    }
}
