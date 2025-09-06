package com.xxs.StaticStudy;

public class Student {
    private static int age = 10;     //静态的变量
    private double score = 99;       //非静态的变量

    public void run() {          //非静态的方法
        go();   //类内的静态方法可以直接被非静态方法访问
    }

    public static void go() {    //静态的方法
        System.out.println("go");
    }

    public static void main(String[] args) {
        //静态变量的使用
        Student s1 = new Student();
        //通过对象的方式使用类内成员变量
        System.out.println(s1.age);
        System.out.println(s1.score);


        //通过类来使用变量，也可称之为类变量
        System.out.println(Student.age);


        //静态方法的使用：静态方法与类一同加载
        //静态方法无法直接访问普通方法
        //非静态方法需要通过new关键字实例化后才可访问
        new Student().run();
        //可通过类名访问静态方法，或直接调用静态方法
        Student.go();
        go();


    }
}
