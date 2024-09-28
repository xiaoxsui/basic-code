package com.xxs.demo1;

public class methodTest1 {
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int copyArr[] = copyOfRange(arr,4,9);
        for (int i = 0;i<copyArr.length;i++){
            System.out.print(copyArr[i] + "\t");
        }
    }
    public static int[] copyOfRange(int arr[] ,int from ,int to) {
        int arr1[] = new int[to - from];
        for (int i = 0;from<to;from++ ,i++)
        {
            arr1[i] = arr[from];
        }
        return arr1;
    }

}
