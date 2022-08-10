package com.zl.jianzhi.day05;

import com.sun.javafx.collections.MappingChange;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;

/**
 * @Description
 * @Author ZhengLing
 * @Date 2022/03/04 14:21
 */
public class Day05_3 {
    public static void main(String[] args) {
        System.out.println(new Solution2().firstUniqChar("abcd"));
    }
}

class Solution2 {
    public char firstUniqChar(String s) {
        int len = s.length();
        if (0 == len) {
            return ' ';
        }
        HashMap<Character, Boolean> map = new HashMap<>();
        for (int i = 0; i < len; i++) {
            char temp = s.charAt(i);
            if (map.containsKey(temp)) {
                map.put(temp, false);
            } else {
                map.put(temp, true);
            }
        }

        for (int i = 0; i < len; i++) {
            char temp = s.charAt(i);
            if (map.get(temp)) {
                return temp;
            }
        }
        return ' ';
    }
}
