package com.xxs.StaticStudy;

public class Person {
    //代码块的学习

    //第二个执行
    {
        //匿名代码块
        System.out.println("匿名代码块");
    }

    //最早执行，与类一同加载，而且只执行一次
    static{
        //静态代码块
        System.out.println("静态代码块");
    }

    //构造方法最后加载
    public Person() {
        System.out.println("构造方法");
    }

    public static void main(String[] args) {
        Person person1 = new Person();
        System.out.println("==========");
        Person person2 = new Person();
    }
}
