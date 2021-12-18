package com.zl.array.array0122;

/**
 * @Description
 * @Author ZhengLing
 * @Date 2021/12/18 9:09
 */
public class Array0122 {
    public static void main(String[] args) {
        System.out.println(new Solution().maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }
}

class Solution {
    public int maxProfit(int[] prices) {
        int ans = 0;
        int len = prices.length;
        for (int i = 1; i < len; i++) {
            if (prices[i] > prices[i - 1]) {
                ans += prices[i] - prices[i - 1];
            }
        }
        return ans;
    }
}