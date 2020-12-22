package com.zl.array.array0031;

import java.util.Arrays;

/**
 * @Description https://leetcode-cn.com/problems/next-permutation/
 * @Author ZhengLing
 * @Date 2020/12/22 15:44
 */
public class Array0031 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,8,5,7,6,4};
        new Solution().nextPermutation(arr);
        System.out.println(Arrays.toString(arr));
    }
}

class Solution {
    public void nextPermutation(int[] nums) {
        int len = nums.length;
        if (len <= 1) {
            return;
        }

        for (int i = len - 1; i >= 1; i--) {
            if (nums[i] > nums[i - 1]) {
                for (int j = len - 1; j >= i; j--) {
                    if (nums[j]>nums[i-1]){
                        int temp = nums[i-1];
                        nums[i-1]=nums[j];
                        nums[j]=temp;
                        break;
                    }
                }
                Arrays.sort(nums,i,len);
                return;
            }
        }
        Arrays.sort(nums);
    }
}