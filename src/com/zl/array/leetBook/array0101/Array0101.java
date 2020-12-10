package com.zl.array.leetBook.array0101;

import java.util.Arrays;

/**
 * @Description https://leetcode-cn.com/leetbook/read/all-about-array/x9rh8e/
 * @Author ZhengLing
 * @Date 2020/12/07 16:31
 */
public class Array0101 {
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