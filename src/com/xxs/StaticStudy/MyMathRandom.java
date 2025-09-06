package com.xxs.StaticStudy;
//静态导入包
import static java.lang.Math.random;

public class MyMathRandom {
    public static void main(String[] args) {
        //正常访问Math包内的random方法
        System.out.println(Math.random());
        //静态导入random方法后，无需书写Math既可调用方法
        System.out.println(random());
    }
}
