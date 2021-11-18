package com.zl.array.array0041;

import java.util.HashMap;

/**
 * @Description
 * @Author ZhengLing
 * @Date 2021/11/18 23:43
 */
public class Array0041 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,7,8,9,11,12};
        System.out.println(new Solution().firstMissingPositive(nums));
    }
}

class Solution {
    public int firstMissingPositive(int[] nums) {

        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                hashMap.put(nums[i],1);
            }
        }

        for (int i = 1; i < Math.pow(2, 31) - 1; i++) {
            if (!hashMap.containsKey(i)) {
                    return i;
            }
        }


        return 0;
    }
}
