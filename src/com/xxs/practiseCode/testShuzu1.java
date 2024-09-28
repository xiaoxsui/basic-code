package com.xxs.practiseCode;
//将数组中内容复制到新数组中
public class testShuzu1 {
    public static void main(String[] args){
        int[] arr = {1,2,3};
        //int[] newArr = new int[arr.length];
        //newArr = arr;
        int[] newArr = arr;
        for (int i = 0;i < arr.length ;i++)
            System.out.print(newArr[i] + " ");
    }
}
