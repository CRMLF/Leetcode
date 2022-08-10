package com.zl.jianzhi.day04;

/**
 * @Description
 * @Author ZhengLing
 * @Date 2022/03/03 21:37
 */
public class Day04_3 {
    public static void main(String[] args) {
        System.out.println(new Solution2().missingNumber(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 9}));
    }
}

class Solution2 {
    public int missingNumber(int[] nums) {
        int len = nums.length;
        int left = 0;
        int right = len - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] > mid) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }
}