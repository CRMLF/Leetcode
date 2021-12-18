package com.zl.array.array0121;

/**
 * @Description
 * @Author ZhengLing
 * @Date 2021/12/18 8:58
 */
public class Array0121 {
    public static void main(String[] args) {
        System.out.println(new Solution().maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }
}

class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int len = prices.length;
        int ans = 0;
        for (int i = 1; i < len; i++) {
            min = Math.min(min, prices[i]);
            ans = Math.max(ans,prices[i] - min);
        }
        return ans;
    }
}