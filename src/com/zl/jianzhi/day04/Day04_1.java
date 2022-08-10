package com.zl.jianzhi.day04;

import java.util.HashMap;

/**
 * @Description
 * @Author ZhengLing
 * @Date 2022/03/03 14:47
 */
public class Day04_1 {
    public static void main(String[] args) {
        System.out.println(new Solution().findRepeatNumber(new int[]{2, 3, 1, 0, 2, 5, 3}));
    }
}

class Solution {
    public int findRepeatNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                return num;
            }
            map.put(num, num);
        }
        return 0;
    }
}