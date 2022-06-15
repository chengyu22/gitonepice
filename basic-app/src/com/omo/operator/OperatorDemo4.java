package com.omo.operator;

/**
 * @author bob
 * @data 2022/6/14-11:15
 */
public class OperatorDemo4 {
    public static void main(String[] args) {
        int a = 10;
        //a++;//a=a+1
        //System.out.println(a++);// 10 a++ 先运行打印后运行下一行获取值
        System.out.println(++a); //11 ++a 先运行a=a+1运行完成后打印


        int b = 10;
        //System.out.println(b--);// 10 b-- 先运行打印后运行下一行获取值
        System.out.println(--b); //9 --b 先运行b=b-1运行完成后打印


        System.out.println("------------------------扩展面试题-----------------------");


        int c = 10;
        int d = 5;
        int rs3 = c++ + ++c - --d - ++d + 1 + c--;
        // rs3     10 + 12  - 4 - 5 + 1 +11
        // c   10  11   12 	 11
        // d   5			  4   5
        System.out.println(rs3);//26
        System.out.println(c); //11
        System.out.println(d);//5
    }
}
