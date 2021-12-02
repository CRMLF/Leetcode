package com.zl.array.array0075;

import java.util.Arrays;

/**
 * @Description
 * @Author ZhengLing
 * @Date 2021/12/02 14:58
 */
public class Array0075 {
    public static void main(String[] args) {
        int[] nums = new int[]{0, 1, 1, 2, 1, 0, 1, 2};
        new Solution().sortColors(nums);
        System.out.println(Arrays.toString(nums));

    }
}

class Solution {
    public void sortColors(int[] nums) {
        //Arrays.sort(nums);
        int ptr1 = 0;

        for (int i = 0; i < nums.length; i++) {
            if (0 == nums[i]) {
                int temp = nums[i];
                nums[i] = nums[ptr1];
                nums[ptr1] = temp;
                ptr1++;
            }
        }
        int ptr2 = ptr1;
        for (int i = ptr1; i < nums.length; i++) {
            if (1 == nums[i]) {
                int temp = nums[i];
                nums[i] = nums[ptr2];
                nums[ptr2] = temp;
                ptr2++;
            }
        }
        

    }
}


