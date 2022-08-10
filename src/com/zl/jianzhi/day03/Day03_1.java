package com.zl.jianzhi.day03;

/**
 * @Description
 * @Author ZhengLing
 * @Date 2022/03/03 14:32
 */
public class Day03_1 {
    public static void main(String[] args) {
        System.out.println(new Solution().replaceSpace("We are happy."));
    }
}

class Solution {
    public String replaceSpace(String s) {
        return s.replace(" ","%20");
    }
}
