package com.zl.array.array0167;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @Description
 * @Author ZhengLing
 * @Date 2021/12/25 23:56
 */
public class Array0167 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().twoSum(new int[]{2, 7, 11, 15}, 9)));
    }
}

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int len = numbers.length;
        for (int i = 1; i <= len; i++) {
            map.put(numbers[i - 1], i);
        }

        for (int i = 1; i <= len; i++) {
            int temp = target - numbers[i - 1];
            if (map.containsKey(temp)) {
                return new int[]{i, map.get(temp)};
            }
        }
        return null;
    }
}