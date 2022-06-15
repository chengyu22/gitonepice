package com.omo.scanner;

import java.util.Scanner;

/**
 * @author bob
 * @data 2022/6/15-9:18
 */
public class ScannerDemo {
    public static void main(String[] args) {
        //键盘的录入技术
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年龄");
        int a = sc.nextInt();
        System.out.println("年龄:" + a);

        System.out.println("请输入姓名");
        String b = sc.next();
        System.out.println("姓名："+b);

    }
}
