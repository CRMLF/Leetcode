package com.zl.array.array0137;

import java.util.HashMap;

/**
 * @Description
 * @Author ZhengLing
 * @Date 2021/12/23 23:09
 */
public class Array0137 {
    public static void main(String[] args) {
        System.out.println(new Solution().singleNumber(new int[]{0, 1, 0, 1, 0, 1, 99}));
    }
}

class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> res = new HashMap<>();
        for (int num : nums) {
            if (!res.containsKey(num)) {
                res.put(num, 1);
            } else {
                res.put(num, res.get(num) + 1);
            }
        }
        for (int re : res.keySet()) {
            if (res.get(re) == 1) {
                return re;
            }
        }
        return 0;
    }
}