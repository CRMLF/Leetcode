package com.zl.jianzhi.day03;

/**
 * @Description
 * @Author ZhengLing
 * @Date 2022/03/03 14:36
 */
public class Day03_2 {
    public static void main(String[] args) {
        System.out.println(new Solution1().reverseLeftWords("abcdefg", 2));
    }
}

class Solution1 {
    public String reverseLeftWords(String s, int n) {
        StringBuilder stringBuilder = new StringBuilder(s);
        String end = stringBuilder.substring(0, n);
        String start = stringBuilder.substring(n);
        return start + end;
    }
}
