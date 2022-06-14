package com.omo.type;

/**
 * @author bob
 * @data 2022/6/14-9:28
 */
public class TypeDemo1 {
    public static void main(String[] args) {
//        自动类型转换
        byte a=20;
        int b=a; //自动类型转换 大范围可以直接赋给小范围

        byte a1=12; // 00001100  自动转换 符号位为0位数不够前面补0
        double db=a1; //00000000 00000000 00000000 00001100

        char ch ='a';
        int b1=ch; //转换存储二进制转换为10进制 97 01100001
        System.out.println(b1);

    }
}
