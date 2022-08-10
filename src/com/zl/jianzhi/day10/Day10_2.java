package com.zl.jianzhi.day10;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @Description
 * @Author ZhengLing
 * @Date 2022/03/06 13:14
 */
public class Day10_2 {
    public static void main(String[] args) {
        System.out.println(new Day10_2().lengthOfLongestSubstring("abba"));
    }

    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int len = s.length();
        if (0 == len) {
            return 0;
        }
        int[] dp = new int[len];
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                dp[i] = Math.min(i - map.get(c), dp[i - 1] + 1);
                map.put(c, i);
            } else {
                if (i == 0) {
                    dp[i] = 1;
                } else {
                    dp[i] = dp[i - 1] + 1;
                }
                map.put(c, i);
            }
        }
        return Arrays.stream(dp).max().getAsInt();
    }
    
    
}


