package com.zl.array.array0026;

import java.util.Arrays;

/**
 * @Description
 * @Author ZhengLing
 * @Date 2020/12/05 12:29
 */
public class Array0026 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 1, 2};
        System.out.println(new Solution().removeDuplicates(arr));
        System.out.println(Arrays.toString(arr));
    }
}

class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int j = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[j] != nums[i]) {
                System.out.println(nums[i]);
                nums[j + 1] = nums[i];
                j++;
            }
        }
        return j + 1;
    }
}