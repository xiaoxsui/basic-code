package com.xxs.AnnotationStudy;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//自定义注解
public class Test2 {
    //注解可以显示赋值，如果没有默认值，我们必须给注解赋值
    @MyAnnotation2(name = "张三")
    public void test(){

    }
}

//固定写法：约束该注解的作用域在类和方法上，调用在运行时
@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation2 {
    //注解的参数：参数类型+参数名(),可以用default关键字设置默认值
    String name() default "";
    int age() default 0;
    int id() default -1;    //默认值为-1，代表不存在
}
