package com.zl.string.string0567;

import java.util.Arrays;

/**
 * @Description
 * @Author ZhengLing
 * @Date 2021/12/03 18:47
 */
public class String0567 {
    public static void main(String[] args) {
        System.out.println(new Solution().checkInclusion("adc", "dcda"));
    }
}

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] target = new int[26];

        int targetLen = s1.length();
        int strLen = s2.length();

        for (int i = 0; i < targetLen; i++) {
            target[s1.charAt(i) - 'a'] += 1;
        }
        
        for (int i = 0; i < strLen - targetLen + 1; i++) {
            String s3 = s2.substring(i, i + targetLen);
            int[] temp = new int[26];
            for (int j = 0; j < targetLen; j++) {
                temp[s3.charAt(j) - 'a'] += 1;
            }
            if (Arrays.equals(temp, target)) {
                return true;
            }
        }
        return false;
    }
}