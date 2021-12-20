package com.zl.array.array0136;

import java.util.Arrays;

/**
 * @Description
 * @Author ZhengLing
 * @Date 2021/12/20 13:19
 */
public class Array0136 {
    public static void main(String[] args) {
        System.out.println(new Solution().singleNumber(new int[]{4, 1, 2, 1, 2}));
    }
}

class Solution {
    public int singleNumber(int[] nums) {
        int len = nums.length;
        if (len==1){
            return nums[0];
        }
        Arrays.sort(nums);
        if (nums[0] != nums[1]) {
            return nums[0];
        }
        for (int i = 1; i < len - 1; i++) {
            if (nums[i] != nums[i - 1] && nums[i] != nums[i + 1]) {
                return nums[i];
            }
        }
        if (nums[len - 1] != nums[len - 2]) {
            return nums[len - 1];
        }
        return 0;
    }


    public int singleNumber2(int[] nums) {
        int single = 0;
        for (int num : nums) {
            single ^= num;
        }
        return single;
    }
    
}