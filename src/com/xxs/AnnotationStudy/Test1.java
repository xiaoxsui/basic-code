package com.xxs.AnnotationStudy;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//什么是注解
public class Test1 {
    //@Override   重写的注解
    @Override
    public String toString() {
        return super.toString();
    }

    //测试Target元注解
    @MyAnnotation
    public void test(){

    }
}

//定义一个注解
//使用Target元注解，约束MyAnnotation注解只可在方法中生效
@Target(value = ElementType.METHOD)
//使用Retention元注解，表示该注解在运行阶段生效
@Retention(value = RetentionPolicy.RUNTIME)
@interface MyAnnotation {

}