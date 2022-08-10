package com.zl.jianzhi.day08;

import java.util.HashMap;

/**
 * @Description
 * @Author ZhengLing
 * @Date 2022/03/05 16:03
 */
public class Day08_1 {
    public static void main(String[] args) {
        System.out.println(new Solution().fib(100));
    }
}

class Solution {
    public int fib(int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 0);
        map.put(1, 1);
        for (int i = 2; i <= n; i++) {
            map.put(i, (map.get(i - 1) + map.get(i - 2)) % 1000000007);
        }
        return map.get(n);
    }
}
