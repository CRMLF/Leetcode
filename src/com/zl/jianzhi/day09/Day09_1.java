package com.zl.jianzhi.day09;

import java.util.Arrays;

/**
 * @Description
 * @Author ZhengLing
 * @Date 2022/03/05 16:30
 */
public class Day09_1 {
    public static void main(String[] args) {
        System.out.println(new Day09_1().maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }

    public int maxSubArray(int[] nums) {
        int len = nums.length;
        int[] dp = new int[len];
        dp[0] = nums[0];
        for (int i = 1; i < len; i++) {
            if (dp[i - 1] <= 0) {
                dp[i] = nums[i];
            } else {
                dp[i] = nums[i] + dp[i - 1];
            }
        }
        return Arrays.stream(dp).max().getAsInt();
    }
}
