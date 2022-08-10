package com.zl.jianzhi.day04;

/**
 * @Description
 * @Author ZhengLing
 * @Date 2022/03/03 21:07
 */
public class Day04_2 {
    public static void main(String[] args) {
        System.out.println(new Solution1().search(new int[]{5, 7, 7, 8, 8, 10}, 8));
    }
}

class Solution1 {
    public int search(int[] nums, int target) {
        int len = nums.length;
        int left = 0;
        int right = len - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        int end = left;
        left = 0;
        right = len - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        int start = right;


        return end - start - 1;
    }
}