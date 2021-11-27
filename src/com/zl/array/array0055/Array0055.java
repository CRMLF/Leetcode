package com.zl.array.array0055;

/**
 * @Description
 * @Author ZhengLing
 * @Date 2021/11/27 21:45
 */
public class Array0055 {
    public static void main(String[] args) {
        System.out.println(new Solution().canJump(new int[]{1, 2, 3}));
    }
}

class Solution {
    public boolean canJump(int[] nums) {
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (i <= max) {
                max = Math.max(max, nums[i] + i);
            }
            if (max >= nums.length - 1) {
                return true;
            }
        }
        return false;
    }
}
