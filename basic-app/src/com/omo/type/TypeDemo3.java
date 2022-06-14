package com.omo.type;

import java.lang.reflect.Type;

/**
 * @author bob
 * @data 2022/6/14-10:19
 */
public class TypeDemo3 {
    public static void main(String[] args) {
        //强制类型转换
        int a=20;
        byte b=(byte) a;
        System.out.println(a);
        System.out.println(b);

        int i =1500;
        byte j = (byte) i;
        //强制类型转换可能会造成数据丢失
        //1500的二进制为 0000000 00000000 00000101 11011100
        //byte 只占1个字节 8位 11011100保存最后的8位 第一位为符号位为负数 ，
        // 计算机保存数据是保存二进制的补码，符号位为0是正数 正数的补码反码都是他自己
        //负数的反码为10100011 符号位不变其余取反 补码是反码加1  10100100 =-(32+4)=-36
        System.out.println(j);
    }
}
