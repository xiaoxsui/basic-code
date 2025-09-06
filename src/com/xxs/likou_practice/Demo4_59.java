package com.xxs.likou_practice;
/*螺旋矩阵
给你一个正整数 n ，生成一个包含 1 到 n^2 所有元素，且元素按顺时针顺序螺旋排列的 n * n 正方形矩阵 matrix 。*/
public class Demo4_59 {
    public static int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int i = 0, target = n * n, num = 1;
        while(i < n/2) {
            for(int j = i; j < n - i - 1; j++) {
                matrix[i][j] = num++;
            }
            for(int j = i; j < n - i - 1; j++) {
                matrix[j][n - i - 1] = num++;
            }
            if(num > target) break;
            for(int j = n - i - 1; j > i; j--) {
                matrix[n - i - 1][j] = num++;
            }
            for(int j = n - i - 1; j > i; j--) {
                matrix[j][i] = num++;
            }
            i++;
        }
        if(n % 2 == 1)
            matrix[n / 2][n / 2] = num;
        return matrix;
    }
    public static void main(String[] args) {
        int[][] matrix = generateMatrix(5);
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
