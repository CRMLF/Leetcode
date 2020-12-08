package com.zl.array.array0016;

import java.util.Arrays;

/**
 * @Description
 * @Author ZhengLing
 * @Date 2020/12/07 14:11
 */
public class Array0016 {
    public static void main(String[] args) {
        System.out.println(new Solution().threeSumClosest(new int[]{-1,2,1,-4},1));
    }
}

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        if (nums.length == 3) {
            return nums[0] + nums[1] + nums[2];
        }
        Arrays.sort(nums);
        int close = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length - 1; i++) {
            int l = i + 1, r = nums.length - 1;
            
            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if (Math.abs(sum - target) < Math.abs(close - target)) {
                    close = sum;
                    System.out.println(nums[i]+" "+nums[l]+" "+nums[r]);
                }
                if (sum == target) {
                    return target;
                } else if (sum > target) {
                    r--;
                } else {
                    l++;
                }
            }
        }
        return close;
    }
}
