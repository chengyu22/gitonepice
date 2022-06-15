package com.omo.branch;

import java.util.Scanner;

/**
 * @author bob
 * @data 2022/6/15-11:08
 */
public class SwitchDemo2 {
    public static void main(String[] args) {
        //用户输入月份可以展示该月份的天数
        //1，3，5，7，8，10，12月份是31天
        //2月份在闰年29天，平年为28天
        //4,,6,9,11月份是30天


        Scanner sc = new Scanner(System.in);
        System.out.println("请输入月份");
        int mouth=sc.nextInt();
        //switch穿透，减少冗余代码，提高性能
        switch (mouth){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(mouth+"月天数是31天");
                break;
            case 2:
                System.out.println(mouth+"月在闰年29天，平年为28天");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(mouth+"月天数是30天");
                break;
            default:
                System.out.println("输入有误");
        }
    }
}
