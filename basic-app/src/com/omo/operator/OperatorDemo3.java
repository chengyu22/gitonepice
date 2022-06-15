package com.omo.operator;

/**
 * @author bob
 * @data 2022/6/14-11:06
 */
public class OperatorDemo3 {
    public static void main(String[] args) {
        //+符号链接符
        int a =5;
        System.out.println("abc"+'a'); //abca
        System.out.println("abc"+a); //abc5
        System.out.println(5+a); //10
        System.out.println("abc"+5+'a');//abc5a
        System.out.println(15+"abc"+15); //15abc15
        System.out.println(a+'a'); //102  'a'char类型默认为int 97
        System.out.println(a+""+'a'); //5a
        System.out.println(a+'a'+"omo ");//102aomo
        System.out.println("omo"+ a+'a');//omo15a
        System.out.println("omo"+(a+'a'));//omo102

    }
}
