package com.zl.jianzhi.day13;

import java.util.Arrays;
import java.util.HashSet;

/**
 * @Description
 * @Author ZhengLing
 * @Date 2022/03/08 16:31
 */
public class Day13_2 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Day13_2().twoSum(new int[]{2, 7, 11, 15}, 9)));
    }

    public int[] twoSum(int[] nums, int target) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        for (int num : nums) {
            if (set.contains(target - num)) {
                return new int[]{num, target - num};
            }
        }
        return null;
    }
}

