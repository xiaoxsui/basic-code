package com.xxs.practiseCode;

import java.util.Random;

//需求:直播抽奖,奖品是现金红包,分别有[2,588,888,1000,10000]五个奖金
//请使用代码模拟抽奖,随机不重复的打印出每个奖项
//效果:588元的奖金被抽出
//2元的奖金被抽出
//10000元的奖金被抽出
//1000元的奖金被抽出
//888元的奖金被抽出
public class testRandom2 {
    public static void main(String[] args){
        int[] money = {2,588,888,1000,10000};
        Random r = new Random();
        for (int i = 0; i < money.length; i++){
            int temp = r.nextInt(money.length -i);
            System.out.println(money[temp] + "元的奖金被抽出");
            for (int j = temp; j < money.length - 1; j++)
                money[j] = money[j+1];
        }
    }
}
