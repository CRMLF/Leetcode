package com.zl.array.array0027;

import java.util.Arrays;

/**
 * @Description
 * @Author ZhengLing
 * @Date 2020/12/05 12:52
 */
public class Array0027 {
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
