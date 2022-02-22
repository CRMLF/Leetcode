package com.zl.jianzhi;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @Description
 * @Author ZhengLing
 * @Date 2022/02/22 19:10
 */
public class day01_2 {
}

class MinStack {

    Deque<Integer> A;

    /**
     * initialize your data structure here.
     */
    public MinStack() {
        A = new ArrayDeque<>();
    }

    public void push(int x) {
        A.push(x);
    }

    public void pop() {
        A.pop();
    }

    public int top() {
        return A.getFirst();
    }

    public int min() {
        int ans = A.getFirst();
        for (Integer integer : A) {
            if (integer < ans) {
                ans = integer;
            }
        }
        return ans;
    }
}

