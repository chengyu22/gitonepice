package com.omo.branch;

import java.util.Scanner;

/**
 * @author bob
 * @data 2022/6/15-10:56
 */
public class SwitchDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入今天是周几");
        String week = sc.next();

        switch (week){
            case "周一":
                System.out.println("星期一");
                break;
            case "周二":
                System.out.println("星期二");
                break;
            case "周三":
                System.out.println("星期三");
                break;
            case "周四":
                System.out.println("星期四");
                break;
            case "周五":
                System.out.println("星期五");
                break;
            case "周六":
                System.out.println("星期六");
                break;
            case "周日":
                System.out.println("星期天");
                break;
            default:
                System.out.println("输出错误");
        }
    }
}
