package com.xxs.likou_practice;
/*长度最小的子数组
给定一个含有 n 个正整数的数组和一个正整数 target 。

找出该数组中满足其总和大于等于 target 的长度最小的 子数组 [numsl, numsl+1, ..., numsr-1, numsr] ，并返回其长度。如果不存在符合条件的子数组，返回 0 。



示例 1：

输入：target = 7, nums = [2,3,1,2,4,3]
输出：2
解释：子数组 [4,3] 是该条件下的长度最小的子数组。
示例 2：

输入：target = 4, nums = [1,4,4]
输出：1
示例 3：

输入：target = 11, nums = [1,1,1,1,1,1,1,1]
输出：0


提示：

1 <= target <= 109
1 <= nums.length <= 105
1 <= nums[i] <= 104*/
public class Demo3_209 {
    //暴力求解，复杂度为O(n^2)
//    public static int minSubArrayLen(int target, int[] nums){
//        int result = Integer.MAX_VALUE;
//        for(int i = 0;i<nums.length;i++){
//            int sum = 0;
//            for(int j=i;j<nums.length;j++){
//                sum += nums[j];
//                if(sum>=target) {
//                    result = Math.min(result,j-i+1);
//                    break;
//                }
//            }
//        }
//        return result == Integer.MAX_VALUE ? 0 : result;
//    }
    //使用滑动窗口算法，单循环双指针动态调整长度区间
    public static int minSubArrayLen(int target, int[] nums) {
        int start = 0, len = Integer.MAX_VALUE, sum = 0;
        for(int end = 0; end < nums.length; end++){
            sum += nums[end];
            while (sum >= target){
                len = Math.min(len, end - start + 1);
                sum -= nums[start];
                start++;
            }
        }
        return len == Integer.MAX_VALUE ? 0 : len;
    }
    public static void main(String[] args) {
        int target = 7;
        int[] nums = {2,3,1,2,4,3};
        System.out.println(minSubArrayLen(target, nums));
    }
}
