package com.zl.array.array0034;

import java.util.Arrays;

/**
 * @Description
 * @Author ZhengLing
 * @Date 2020/12/19 14:38
 */
public class Array0034 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().searchRange(new int[]{1}, 1)));
    }
}

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start = -1;
        int over = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                start = i;
                while (++i < nums.length && nums[i] == target) {
                    over = i;
                }
                over -= 1;
                break;
            }
        }
        if (over < start) {
            over = start;
        }
        return new int[]{start, over};
    }
}