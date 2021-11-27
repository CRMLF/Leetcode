package com.zl.array.array0053;

/**
 * @Description
 * @Author ZhengLing
 * @Date 2021/11/27 20:07
 */
public class Array0053 {
    public static void main(String[] args) {
        System.out.println(new Solution().maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }
}

class Solution {
    public int maxSubArray(int[] nums) {
        int res = nums[0];
        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            max = Math.max(max + nums[i], nums[i]);
            res = Math.max(res, max);
        }

        return res;
    }
}