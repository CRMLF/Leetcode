package com.zl.array.array0128;

import java.util.Arrays;

/**
 * @Description
 * @Author ZhengLing
 * @Date 2021/12/18 10:31
 */
public class Array0128 {
    public static void main(String[] args) {
        System.out.println(new Solution().longestConsecutive(new int[]{1, 2, 0, 1}));
    }
}

class Solution {
    public int longestConsecutive(int[] nums) {
        int len = nums.length;
        if (0 == len) {
            return 0;
        }
        Arrays.sort(nums);
        int ans = 1;
        int max = 1;
        for (int i = 1; i < len; i++) {
            if (nums[i] - 1 == nums[i - 1]) {
                max += 1;
            } else if (nums[i] == nums[i - 1]) {
                continue;
            } else {
                max = 1;
            }
            ans = Math.max(ans, max);
        }
        return ans;
    }
}