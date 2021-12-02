package com.zl.array.array0077;

import java.util.*;

/**
 * @Description
 * @Author ZhengLing
 * @Date 2021/12/02 15:46
 */
public class Array0077 {
    public static void main(String[] args) {
        System.out.println(new Solution().combine(5, 5));
    }
}

class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        Deque<Integer> path = new ArrayDeque<>();
        dfs(n, 1, path, res, k);
        return res;
    }
    public void dfs(int n, int begin, Deque<Integer> path, List<List<Integer>> res, int k) {
        if (k == path.size()) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = begin; i <= n; i++) {
            path.addLast(i);
            dfs(n, i+1, path, res, k);
            path.removeLast();
        }
    }
}
