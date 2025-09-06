package com.xxs.likou_practice;
/*有序数组的平方
给你一个按 非递减顺序 排序的整数数组 nums，返回每个数字的平方组成的新数组，要求也按 非递减顺序 排序。

示例 1：

输入：nums = [-4,-1,0,3,10]
输出：[0,1,9,16,100]
解释：平方后，数组变为 [16,1,0,9,100]
排序后，数组变为 [0,1,9,16,100]
示例 2：

输入：nums = [-7,-3,2,3,11]
输出：[4,9,9,49,121]
提示：

1 <= nums.length <= 104
-104 <= nums[i] <= 104
nums 已按 非递减顺序 排序
*/
public class Demo2_977 {
    public static void main(String[] args) {
        int[] nums = {-4,-3,-2,-1,0,1,2,3,4,5,6};
        int[] newNums = sortedSquares(nums);
        for(int i=0;i<newNums.length;i++){
            System.out.print(newNums[i]+" ");
        }
    }
//暴力思路
//    public static int[] sortedSquares(int[] nums) {
//        int[] newNums = new int[nums.length];
//        for(int i = 0; i < nums.length; i++) {
//            int tmp = nums[i]*nums[i];
//            newNums[i] = tmp;
//        }
//        for(int i = 0; i < newNums.length-1; i++) {
//            int flag = 0;
//            for(int j = 0; j < newNums.length-1-i; j++) {
//                if (newNums[j] > newNums[j + 1]) {
//                    int tmp = newNums[j];
//                    newNums[j] = newNums[j + 1];
//                    newNums[j + 1] = tmp;
//                    flag = 1;
//                }
//            }
//            if(flag == 0) {
//                break;
//            }
//        }
//        return newNums;
//    }

// 双指针思路，首尾同时由大到小进行排列，时间复杂度为O(n)
    public static int[] sortedSquares(int[] nums){
        int[] newNums = new int[nums.length];
        int i = nums.length-1;
        for(int head=0,tail=nums.length-1; head<=tail;){
            if(nums[head]*nums[head]<nums[tail]*nums[tail]){
                newNums[i--] = nums[tail]*nums[tail];
                tail--;
            }
            else{
                newNums[i--] = nums[head]*nums[head];
                head++;
            }
        }
        return newNums;

    }

}

