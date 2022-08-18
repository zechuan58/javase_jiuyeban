package com.itheima.d4_api_bigdecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Demo9 {
    public static void main(String[] args) {
        //第一步:需要把参与运算的数据全部封装为BigDecimal对象
        BigDecimal bd1=BigDecimal.valueOf(0.01);
        BigDecimal bd2=BigDecimal.valueOf(0.09);

        //第二步:再使用BigDecimal的方法进行运算
        BigDecimal sum=bd1.add(bd2);
        System.out.println("和为:"+sum);

        BigDecimal sub=bd1.subtract(bd2);
        System.out.println("差为:"+sub);

        BigDecimal div=bd2.divide(bd1);
        System.out.println("商为:"+div);

        BigDecimal mul=bd1.multiply(bd2);
        System.out.println("积为:"+mul);

        System.out.println("---------------");
        BigDecimal bd3=BigDecimal.valueOf(10);
        BigDecimal bd4=BigDecimal.valueOf(3);

        //计算10除以3,由于除不尽就会出现异常
        // 我想要保留2位小数,可以指定保留小数的方式
        // 参数1:除数
        // 参数2:保留小数位的个数
        // 参数3:保留小数的方式
        // RoundingMode.UP:进一法 第三位不管是否满5都往前进一位
        // RoundingMode.DOWN:去尾法,第三位不管是否满5都往舍弃
        // RoundingMode.HALF_UP:四舍五入法,第三位如果满5就往前进一位,否则舍弃

        BigDecimal div2=bd3.divide(bd4,2, RoundingMode.HALF_UP);
        System.out.println(div2);

    }
}
