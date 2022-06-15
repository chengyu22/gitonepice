package com.omo.operator;

/**
 * @author bob
 * @data 2022/6/14-11:41
 */
public class OperatorDemo5 {
    public static void main(String[] args) {
        //三元运算符
        double score=98;
        String rs =score>=60 ? "通过":"挂科";
        System.out.println(rs);


        System.out.println("--------------------------从两个整数中找出较大值----------------------------");
        int a=170;
        int b=100;
        int c=90;
       String f= a>b?"a>b":"a<b";
        System.out.println(f);

        int reMax1 = a>b?(c>a?c:a):(c>b?c:b);
        System.out.println(reMax1);
    }
}
