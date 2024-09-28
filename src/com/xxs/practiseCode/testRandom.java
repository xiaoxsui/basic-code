package com.xxs.practiseCode;

import java.util.Random;

//需求:定义方法时间随机产生一个5位的验证码
//验证码格式:长度为5;前四位是大写字母或小写字母;最后一位是数字
public class testRandom {
    public static void main(String[] args){
        char chs[] = new char[52];
        for (int i = 0; i < chs.length; i++){
            if (i < 26)
                chs[i] = (char)('a' + i);
            else
                chs[i] = (char)('A' + i -26);
        }
        Random r = new Random();
        String result = "";
        for (int i = 0; i < 4; i++){
            result = result + chs[r.nextInt(chs.length)];
        }
        result = result + r.nextInt(10);
        System.out.println(result);
    }
}
