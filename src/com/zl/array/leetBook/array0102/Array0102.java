package com.zl.array.leetBook.array0102;

import java.util.Arrays;

/**
 * @Description https://leetcode-cn.com/leetbook/read/all-about-array/x9p1iv/
 * @Author ZhengLing
 * @Date 2020/12/07 21:58
 */
public class Array0102 {
    public static void main(String[] args) {
        int[] arr = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        System.out.println(new Solution().removeElement(arr, val));
        System.out.println(Arrays.toString(arr));
    }
}

class Solution {
    public int removeElement(int[] nums, int val) {
        if (nums.length == 0) {
            return 0;
        }
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[j] = nums[i];
                j++;
            }
        }

        return j;
    }
}
