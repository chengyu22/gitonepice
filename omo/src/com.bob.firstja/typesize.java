package com.bob.firstja;

/**
 * @author bob
 * @data 2022/6/13-16:28
 */
public class typesize {
    public static void main(String[] args) {
//        基本数据类型
//       1 byte字节型占一个字节8位 -128 - 127
        byte number=97;
        System.out.println(number);
//       byte number2=128  超出范围报错

//        2 short短整型 占两个字节
        short money =3000;

//        3 int 整型默认的类型 占4个字节默认使用的类型
        int it =231090909;

//        4 long整型 占8个字节
        long lg=546665671;
//        随便写的整数默认位int类型 没有超过long的长度,超过了int类型的长度了
//        需要将一个整数字面量变为long类型,在其后加上L/l
        long lg2=19999999922200000l;

//        5 浮点型(小数)
//        float单精度 占4个字节
//        写的小数点字面量默认为double 需要将一个小数变为float类型在其后加F/f
            float score=98.5f;


//        6 double 双精度占8个字节
        double score2=999.99;

//        7字符型 char 占2个字节
        char ch ='a';
        char ch2 ='中';
//        char ch3 ='中国';//报错是字符串

//        8 布尔类型 占1位 boolean
        boolean re=true;
        boolean re2=false;

        System.out.println("---------------------引用数据类型---------------------");

        String name="西门吹雪";
        System.out.println(name);

    }
}
