package com.omo.operator;

/**
 * @author bob
 * @data 2022/6/14-10:50
 */
public class OperatorDemo1 {
    public static void main(String[] args) {
        //算术运算符的使用
        int a = 10;
        int b = 3;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b); //3.3333==>3 结果是double类型被强制转换为了int类型丢失部分数据
        System.out.println(a * 1.0 / b);//3.333333
        System.out.println(3 * 1.0 / 2); //1.5
        System.out.println(3 / 2 * 1.0); //1.0
        System.out.println(a % b);//1

    }
}