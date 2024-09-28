package com.xxs.practiseCode;

import java.util.Random;
import java.util.Scanner;

//需求:双色球系统
//投注号码由6个红色球号码和1个蓝色球号码组成,红色球号码从1-33中选择,蓝色球号码从1-16中选择
//为用户随机7位号码,匹配中奖情况
//中2+1;1+1;0+1  得5元
//中4+0;3+1      得10元
//中5+0;4+1      得200元
//中5+1          得3000元
//中6+0          得最高五百万
//中6+1          得最高一千万
public class testRandom3 {
    public static void main(String[] args){
        int[] user = new int[7];
//        int[] number = new int[7];
        int[] number = {1,2,3,4,5,6,7};
        int red = 0,blue = 0;
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("请用户输入你的双色球号码:");
        for (int i = 0; i < user.length; i++){
            user[i] = sc.nextInt();
        }
//        for (int i = 0; i < 6; i++){
//            number[i] = r.nextInt(33) + 1;
//        }
//        number[6] = r.nextInt(16) + 1;
        for (int i = 0; i < 6; i++)
            if (user[i] == number[i])
                red++;
        if (user[6] == number[6])
            blue++;
        System.out.print("您的双色球号码确认是:");
        for (int i = 0; i < user.length; i++)
            System.out.print(user[i] + " ");
        System.out.println();
        System.out.print("中奖双色球号码发布为:");
        for (int i = 0; i < number.length; i++)
            System.out.print(number[i] + " ");
        if ((red + blue) == 0)
            System.out.println("抱歉,未中奖");
        else if((red + blue) < 4 && (red + blue) > 0)
            System.out.println("恭喜中奖,得5元");
        else if ((red + blue) < 5)
            System.out.println("恭喜中奖,得10元");
        else if ((red + blue) < 6)
            System.out.println("恭喜中奖,得200元");
        else if (red == 5 && blue == 1)
            System.out.println("恭喜中奖,得3000元");
        else if(red == 6 && blue == 0)
            System.out.println("恭喜中奖,得最高五百万");
        else if(red == 6 && blue ==1)
            System.out.println("恭喜中奖,得最高一千万");
    }
}
