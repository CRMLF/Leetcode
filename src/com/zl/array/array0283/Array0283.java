package com.zl.array.array0283;

import java.util.Arrays;

/**
 * @Description https://leetcode-cn.com/problems/move-zeroes/
 * @Author ZhengLing
 * @Date 2020/12/07 22:01
 */
public class Array0283 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 0, 0, 1};
        new Solution().moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
}

class Solution {
    public void moveZeroes(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j++] = nums[i];
            }
        }
        for (int i = j; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
