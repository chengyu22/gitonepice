package com.omo.type;

/**
 * @author bob
 * @data 2022/6/14-9:48
 */
public class TypeDemo2 {
    public static void main(String[] args) {
//        在不同类型值的计算中以范围最大的类型来接收值
        byte a = 127;
        int b = 223;
        double c = 1.0;
        double rs = a + b + c;
        System.out.println(rs);

        //面试题
        byte i = 10;
        byte j = 20;
        int d = i + j;
        System.out.println(d);
        //在计算中 byte short char 的值默认是int类型的 只能由int类型接收
    }


}
