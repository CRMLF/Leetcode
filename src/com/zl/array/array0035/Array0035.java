package com.zl.array.array0035;

/**
 * @Description
 * @Author ZhengLing
 * @Date 2021/11/18 19:48
 */
public class Array0035 {
    public static void main(String[] args) {
        System.out.println(new Solution().searchInsert(new int[]{1,3,5,6}, 0));
    }
}

class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int mid = (left + right) / 2;
        while (left <= right) {
            mid = (left + right) / 2;
            if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        
        if (nums[mid] > target) {
            return mid;
        } else {
            return mid + 1;
        }
    }
}