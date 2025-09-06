package com.xxs.task;

public class task1{
    public static void main(String[] args){
        System.out.println("1.");
        test1();
        System.out.println("\n2.");
        test2();
        System.out.println("\n3.");
        test3();
        System.out.println("\n4.");
        test4();
        System.out.println("\n5.");
        test5();
        System.out.println("\n6.");
        test6();
    }

    public static void test1(){
        System.out.println("Welcome to Java");
        System.out.println("Welcome to Computer Science");
        System.out.println("Programming is fun");
    }

    public static void test2(){
        for(int i = 0;i<5;i++){
            System.out.println("Welcome to Java");
        }
    }

    public static void test3(){
        System.out.println((9.5*45)-(2.5*3));
        System.out.println(45.5-3.5);
    }

    public static void test4(){
        int sum = 0;
        for (int i = 1;i<10;i++){
            sum+=i;
        }
        System.out.println(sum);
    }

    public static void test5(){
        double width,height;
        width = 4.5;height=7.9;
        System.out.println("矩形的面积为："+(width*height));
        System.out.println("矩形的周长为："+(width*2+height*2));
    }

    public static void test6(){
        long people = 312032486L;
        for (int i = 0;i<5;i++){
            people += 365*24*60/7;
            people -= 365*24*60/13;
            people += 365*24*60/45;
            System.out.println(2026+i+": "+people);
        }
    }
}