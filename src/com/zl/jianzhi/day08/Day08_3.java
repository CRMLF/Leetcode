package com.zl.jianzhi.day08;

/**
 * @Description
 * @Author ZhengLing
 * @Date 2022/03/05 16:17
 */
public class Day08_3 {
    public static void main(String[] args) {
        System.out.println(new Day08_3().maxProfit(new int[]{7,6,4,3,1}));
    }

    public int maxProfit(int[] prices) {
        if (prices.length <= 1) {
            return 0;
        }
        int min = prices[0];
        int res = 0;
        for (int i = 1; i < prices.length; i++) {
            min = Math.min(min, prices[i]);
            if (prices[i] - min > 0) {
                res = Math.max(prices[i] - min,res);
            }
        }

        return res;
    }
}


