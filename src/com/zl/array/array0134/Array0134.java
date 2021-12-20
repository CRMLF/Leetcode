package com.zl.array.array0134;

/**
 * @Description
 * @Author ZhengLing
 * @Date 2021/12/19 10:05
 */
public class Array0134 {
    public static void main(String[] args) {
        System.out.println(new Solution().canCompleteCircuit(new int[]{4, 5, 2, 6, 5, 3}, new int[]{3, 2, 7, 3, 2, 9}));
    }
}

class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int len = gas.length;
        int spare = 0;
        int minSpare = Integer.MAX_VALUE;
        int minIndex = 0;

        for (int i = 0; i < len; i++) {
            spare += gas[i] - cost[i];
            if (spare < minSpare) {
                minSpare = spare;
                minIndex = i;
            }
        }

        return spare < 0 ? -1 : (minIndex + 1) % len;
    }
}