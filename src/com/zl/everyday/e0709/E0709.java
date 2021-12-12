package com.zl.everyday.e0709;

/**
 * @Description
 * @Author ZhengLing
 * @Date 2021/12/12 9:51
 */
public class E0709 {
    public static void main(String[] args) {
        System.out.println(new Solution().toLowerCase("Hello"));
    }
}

class Solution {
    public String toLowerCase(String s) {
        return s.toLowerCase();
    }

    public String toLowerCase2(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); ++i) {
            char ch = s.charAt(i);
            if (ch >= 65 && ch <= 90) {
                ch |= 32;
            }
            sb.append(ch);
        }
        return sb.toString();
    }
}
