package com.xxs.practiseCode;

import java.util.Scanner;

public class monkey_eat_taozi {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        int Aa = 0, Ab = 1, Ac = 2, Ad = 3, Ae = 4, count = 0;
        int treenum = scan.nextInt();
        int[] tao = new int[treenum];
        for (int i = 0; i < treenum; i++) {
            tao[i] = scan.nextInt();
        }
        for (; Aa <= treenum - 5; Aa++) {
            for (; Ab <= treenum - 4; Ab++) {
                for (; Ac <= treenum - 3; Ac++) {
                    for (; Ad <= treenum - 2; Ad++) {
                        for (; Ae <= treenum - 1; Ae++)
                            if (tao[Aa] + tao[Ab] == tao[Ac] && tao[Ad] + tao[Ae] == tao[Ac]) {
                                count++;
                            }
                        Ae = Ad + 2;
                    }
                    Ad = Ac + 2;
                    Ae = Ad + 1;
                }
                Ac = Ab + 2;
                Ad = Ac + 1;
                Ae = Ad + 1;
            }
            Ab = Aa + 2;
            Ac = Ab + 1;
            Ad = Ac + 1;
            Ae = Ad + 1;
        }
        System.out.println(count);
    }
}
