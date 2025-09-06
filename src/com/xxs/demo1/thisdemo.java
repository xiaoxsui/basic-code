package com.xxs.demo1;
//测试this关键字在类中被调用的用法，this将会代表调用其进行使用的当前对象
public class thisdemo {
    public static void main(String[] args){
        Boy boy1 = new Boy();
        Girl girl1 = new Girl();
        //创建对象
        boy1.setName("张三");
        boy1.setAge(18);
        girl1.setName("李四");
        girl1.setAge(18);
        //该次调用的当前对象为girl1
        girl1.marry(boy1);

        Girl girl2 = new Girl();
        girl2.setName("范冰冰");
        //该次调用的当前对象为girl2
        girl2.marry(boy1);
    }
}

class Boy {
    private String name;
    private int age;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }

    public void shout(Girl girl){
        System.out.println("呼喊：太好了！我也想要娶" + girl.getName() + "为妻！");
    }
}

class Girl {
    private String name;
    private int age;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setAge(int age){
        if (age >= 18 && age <= 30)
            this.age = age;
    }
    public int getAge(){
        return age;
    }

    public void marry(Boy boy){
        System.out.println("我想嫁给" + boy.getName() + "!");
        boy.shout(this);
    }

}
