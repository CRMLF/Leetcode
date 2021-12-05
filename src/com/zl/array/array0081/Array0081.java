package com.zl.array.array0081;

/**
 * @Description
 * @Author ZhengLing
 * @Date 2021/12/05 22:08
 */
public class Array0081 {
    public static void main(String[] args) {
        System.out.println(new Solution().search(new int[]{}, 0));
    }
}

class Solution {
    public boolean search(int[] nums, int target) {
        for (int num : nums) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }
}
