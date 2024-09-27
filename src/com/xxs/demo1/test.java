package com.xxs.demo1;

import java.util.Scanner;

/*
需求:您和您的对象在餐厅里面正在越活.
键盘输入两个整数,表示你和你约会对象衣服的时髦度(手动录入0-10之间的整数)
如果你的时髦程度大于你对象的时髦程度,相亲就成功,输出true
否则输出false
*/
public class test {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你衣服的时髦度");
        int fashionMe = sc.nextInt();
        System.out.println("请输入你对象衣服的时髦度");
        int fashionShe = sc.nextInt();
//        if(fashionMe > fashionShe)
//            System.out.println("相亲成功");
//        else
//            System.out.println("相亲失败");
        boolean result = fashionMe > fashionShe;
        System.out.println(result);
    }
}
