package com.xxs.InnerClassStudy;

public class Application {
    public static void main(String[] args) {
        Outer outer = new Outer();
        //通过Outer这个外部类来实例化内部类
        Outer.Inner inner = outer.new Inner();
        inner.in();
        inner.getID();

        //匿名初始化：没有名字初始化类，不用将实例保存到变量中
        new Apple().eat();

        //匿名创建类，可以重写接口方法，这时视为在这里创建了一个没有名字的类来实现接口方法
        UserService userService = new UserService() {
            @Override
            public void hello() {
                System.out.println("hello");
            }
        };
    }
}


//测试匿名内部类的使用
//一个文件中可以创建多个类，但只有一个类可以被public修饰，其余类也可被视为内部类
class Apple{
    public void eat(){
        System.out.println("Apple");
    }
}

interface UserService{
    void hello();
}