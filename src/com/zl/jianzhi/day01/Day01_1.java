package com.zl.jianzhi.day01;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @Description https://leetcode-cn.com/problems/yong-liang-ge-zhan-shi-xian-dui-lie-lcof/
 * @Author ZhengLing
 * @Date 2022/02/22 18:56
 */
public class Day01_1 {
    public static void main(String[] args) {

    }
}

class CQueue {

    Deque<Integer> A, B;

    public CQueue() {
        A = new ArrayDeque<>();
        B = new ArrayDeque<>();
    }

    public void appendTail(int value) {
        A.addLast(value);
    }

    public int deleteHead() {
        if (!B.isEmpty()) {
            return B.removeLast();
        }
        if (A.isEmpty()) {
            return -1;
        }
        while (!A.isEmpty()) {
            B.addLast(A.removeLast());
        }
        return B.removeLast();
    }
}