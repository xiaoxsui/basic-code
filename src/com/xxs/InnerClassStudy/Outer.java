package com.xxs.InnerClassStudy;
//定义一个外部类
public class Outer {
    private int id = 10;
    public void out(){
        System.out.println("这是外部类的方法");
    }

    //定义一个内部类
    public class Inner {
        public void in(){
            System.out.println("这是内部类的方法");
        }
        //可以通过内部类获得外部类的私有属性
        public void getID(){
            System.out.println(id);
        }

    }

    //创建静态内部类
    public static class Inner2 {
        //此时发现无法调用id，这是因为new实例化时会先加载静态类，static的内部类无法访问外部非static属性
        public void getID(){
       //     System.out.println(id);
        }
    }

    //创建局部内部类
    public void method(){
        class Inner3{
            public void in(){

            }
        }
    }
}
