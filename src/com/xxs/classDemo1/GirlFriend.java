package com.xxs.classDemo1;

public class GirlFriend {
    //定义属性
    private String name;
    private int age;
    private String gender;

    //针对每个私有化的成员变量,都需要提供get和set方法
    //set方法:给成员变量赋值
    //get方法:对外提供成员变量的值
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setAge(int age){
        if(age >= 18 && age <= 50)
            this.age = age;
        else
            System.out.println("非法参数");
    }
    public int getAge(){
        return age;
    }

    public void setGender(String gender){
        this.gender = gender;
    }
    public String getGender(){
        return gender;
    }

    //定义行为
    public void sleep(){
        System.out.println("女朋友正在睡觉");
    }
    public void eat(){
        System.out.println("女朋友正在吃饭");
    }
}
