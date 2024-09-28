package com.xxs.practiseCode;

import java.util.Scanner;

//需求:输入某系统的数字密码(大于0),采用加密方式进行传输
//规则如下:先得到每位数,然后每位数都加上5,再对10求余,最后将所有数字反转,得到一串新数
public class testShuzuJiami {
    public static void main(String[] args){
        int number;
        int result = 0;
        System.out.println("请输入一串数字:");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        int count = 0;
        int newNumber = number;
        while(newNumber > 0)
        {
            newNumber /=10;
            count++;
        }
        int[] newCount = new int[count];
        for (int i = 0;i < newCount.length ;i++){
            int temp = number % 10;
            number /= 10;
            newCount[i] = (temp + 5) % 10;
        }


        for (int i =0 ;i < newCount.length; i++)
            result = result * 10 + newCount[i];
        System.out.println("加密后的数字为:");
        System.out.println(result);
    }
}
