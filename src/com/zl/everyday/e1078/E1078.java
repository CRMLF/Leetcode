package com.zl.everyday.e1078;

import java.util.Arrays;

/**
 * @Description
 * @Author ZhengLing
 * @Date 2021/12/26 8:24
 */
public class E1078 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().findOcurrences("alice is a good girl she is a good student", "a", "good")));
    }
}

class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        String[] s = text.split(" ");
        System.out.println(Arrays.toString(s));
        return null;
    }
}