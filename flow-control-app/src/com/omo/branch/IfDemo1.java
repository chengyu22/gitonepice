package com.omo.branch;

import java.util.Scanner;

/**
 * @author bob
 * @data 2022/6/15-10:41
 */
public class IfDemo1 {
    public static void main(String[] args) {
    //心跳（60-100）之间是正常的，否则系统进一步检查
        while(true){
        Scanner sc= new Scanner(System.in);
        System.out.println("请输入心跳值");
        int a=sc.nextInt();

        if (a>60 & a<100){
            System.out.println("你很健康");
        }
        else{
            System.out.println("需要进一步检查身体了");
        }
    }
    }
}
