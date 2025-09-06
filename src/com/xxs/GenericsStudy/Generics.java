package com.xxs.GenericsStudy;

public class Generics {
    public static void main(String[] args) {
        //因为使用学生类时没有给具体的泛型类型，所以泛型的类型是Object
        Student s1 = new Student();
        //可以在创建实例时主动给出类型
        Student<String, Integer> s2 = new Student<>();  //int的Object
    }
}

//泛型类
class Student<A, B> {
    //当我在类中有变量的类型不确定时，就可以在类名后定义泛型
    private A name;
    private B age;

    public Student() {
    }

    public Student(A name, B age) {
        this.name = name;
        this.age = age;
    }

    public A getName() {
        return name;
    }

    public void setName(A name) {
        this.name = name;
    }

    public B getAge() {
        return age;
    }

    public void setAge(B age) {
        this.age = age;
    }
}