package com.zl.array.array0080;

import java.util.Arrays;

/**
 * @Description https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array-ii/
 * @Author ZhengLing
 * @Date 2020/12/10 15:40
 */
public class Array0080 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,1,1,2,2,3};
        System.out.println(new Solution().removeDuplicates(arr));
        System.out.println(Arrays.toString(arr));
    }
}

class Solution {
    public int removeDuplicates(int[] nums) {
        int j = 1;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[j] || nums[i] != nums[j - 1]) {
                nums[++j] = nums[i];
            }
        }

        return j + 1;
    }
}

