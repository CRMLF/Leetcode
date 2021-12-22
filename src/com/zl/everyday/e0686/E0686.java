package com.zl.everyday.e0686;

/**
 * @Description
 * @Author ZhengLing
 * @Date 2021/12/22 23:26
 */
public class E0686 {
    public static void main(String[] args) {
        System.out.println(new Solution().repeatedStringMatch("abc", "cabcabca"));
    }
}

class Solution {
    public int repeatedStringMatch(String a, String b) {
        if (a.contains(b)) {
            return 1;
        }
        int len = b.length() / a.length() + 2;
        StringBuffer stringBuffer = new StringBuffer(a);
        for (int i = 2; i <= len; i++) {
            stringBuffer.append(a);
            if (stringBuffer.toString().contains(b)) {
                return i;
            }
        }
        return -1;
    }
}

