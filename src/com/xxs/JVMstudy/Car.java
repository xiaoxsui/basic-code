package com.xxs.JVMstudy;

public class Car {
    public static void main(String[] args) {
        //类是模板，对象是具体的
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
        //通过new关键字将类实例化
        System.out.println(car1.hashCode());
        System.out.println(car2.hashCode());
        System.out.println(car3.hashCode());

        Class<? extends Car> aclass1 = car1.getClass();
        Class<? extends Car> aclass2 = car2.getClass();
        Class<? extends Car> aclass3 = car3.getClass();
        //通过getClass将实例返回类的具体模板对象
    }
}
