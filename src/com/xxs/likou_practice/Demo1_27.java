package com.xxs.likou_practice;

/*移除元素
给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素。元素的顺序可能发生改变。然后返回 nums 中与 val 不同的元素的数量。

假设 nums 中不等于 val 的元素数量为 k，要通过此题，您需要执行以下操作：

更改 nums 数组，使 nums 的前 k 个元素包含不等于 val 的元素。nums 的其余元素和 nums 的大小并不重要。
返回 k。
用户评测：

评测机将使用以下代码测试您的解决方案：

int[] nums = [...]; // 输入数组
int val = ...; // 要移除的值
int[] expectedNums = [...]; // 长度正确的预期答案。
                            // 它以不等于 val 的值排序。

int k = removeElement(nums, val); // 调用你的实现

assert k == expectedNums.length;
sort(nums, 0, k); // 排序 nums 的前 k 个元素
for (int i = 0; i < actualLength; i++) {
    assert nums[i] == expectedNums[i];
}
如果所有的断言都通过，你的解决方案将会 通过。*/


public class Demo1_27 {
    public static void main(String[] args) {
        int[] nums = {2,3,2,3,5,6,7};
        int val = 3;
        int k = removeElement(nums, val);
        for(int i = 0;i<k;i++){
            System.out.print(nums[i]+" ");
        }
    }

    //笨办法
    /*
    public static int removeElement(int[] nums, int val) {
        int count = 0;
        for(int i = 0; i < nums.length-count; i++){
            if(nums[i] == val){
                for(int j = i + 1; j < nums.length-count; j++){
                    nums[j-1] = nums[j];
                }
                count++;
                i--;
            }
        }
        return nums.length-count;
    }
    */

    //双指针实现数组移出元素，时间复杂度O(n)
    public static int removeElement(int[] nums, int val) {
        int slow=0;
        for(int fast = 0;fast<nums.length;fast++){
            if(nums[fast] != val){
                nums[slow++] = nums[fast];
            }
        }
        return slow;    //慢指针自然指向新数组后一位置，也就是数组大小
    }
}


