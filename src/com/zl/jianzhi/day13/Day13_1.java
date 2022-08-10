package com.zl.jianzhi.day13;

import java.util.Arrays;

/**
 * @Description
 * @Author ZhengLing
 * @Date 2022/03/08 16:15
 */
public class Day13_1 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Day13_1().exchange(new int[]{1, 2, 3, 4})));
    }

    public int[] exchange(int[] nums) {
        int len = nums.length;
        if (len <= 1) {
            return nums;
        }
        int i = 0;
        int j = len - 1;
        while (i < j) {
            while (i < j && nums[i] % 2 == 1) i++;
            while (i < j && nums[j] % 2 == 0) j--;
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

        return nums;
    }
}
