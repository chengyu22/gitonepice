package com.omo.operator;

/**
 * @author bob
 * @data 2022/6/14-10:59
 */
public class OperatorTest2 {
    public static void main(String[] args) {
        //将3位数的个位 十位 百位分别输出
        int a = 123;
        //个位
        int ge = a % 10;
        System.out.println(ge);

        //十位
        int shi = a / 10 % 10;
        System.out.println(shi);

        //百位
        int bai = a / 100;
        System.out.println(bai);
    }
}
