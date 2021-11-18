package com.zl.array.array0034;

import java.util.Arrays;

/**
 * @Description
 * @Author ZhengLing
 * @Date 2020/12/19 14:38
 */
public class Array0034 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().searchRange(new int[]{5, 7, 7, 8, 8, 10}, 7)));
    }
}

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start = -1;
        int over = -1;
        int i = 0;
        for (; i < nums.length; i++) {
            if (nums[i] == target) {
                start = i;
                over = i;
                for (int j = i; j < nums.length; j++) {
                    if (nums[j] == target) {
                        over = j;
                    }
                }
                break;
            }
        }
        if (i > nums.length) {
            return new int[]{-1, -1};
        }

        return new int[]{start, over};
    }
}