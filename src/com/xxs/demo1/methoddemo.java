package com.xxs.demo1;
//方法的学习

import java.util.Scanner;

public class methoddemo {
    public static void main(String[] args) {
//            Scanner sc = new Scanner(System.in);
//            System.out.println("请输入一个数");
//            int i = sc.nextInt();
//            System.out.println(methodDemo1(i));

//            multiply();

        System.out.println("请输入两数");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        System.out.println(compare(i,j));
        System.out.println(compare((short)i,(short)j));
        System.out.println(compare((byte)i,(byte)j));
        System.out.println(compare((long)i,(long)j));


    }
//声明一个方法
    public static int methodDemo1(int i){   //定义一个形式参数
            return i * 2 + 1;
    }
//需求:打印99乘法表
    public static void multiply(){
        for (int i = 1; i <= 9;i++) {
            for (int j = 1; j <= i; j++)
                System.out.print(i + "*" + j + "=" + i * j + "\t");
            System.out.println();
        }
    }
//判断两个数是否相等
    public static boolean compare(int i ,int j){
        System.out.print("int " + "\t");
        return i == j;
    }
//方法重载学习:设计比较两个整数是否相同的方法,需兼容全整数类型
    public static  boolean compare(byte i ,byte j){
        System.out.print("byte" + "\t");
        return i == j;
    }

    public static  boolean compare(short i ,short j){
        System.out.print("short" + "\t");
        return i == j;
    }

    public static  boolean compare(long i ,long j){
        System.out.print("long" + "\t");
        return i == j;
    }

}




