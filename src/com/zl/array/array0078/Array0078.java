package com.zl.array.array0078;

import java.util.*;

/**
 * @Description
 * @Author ZhengLing
 * @Date 2021/12/02 23:21
 */
public class Array0078 {
    public static void main(String[] args) {
        System.out.println(new Solution().subsets2(new int[]{1, 2, 3}));
    }
}

class Solution {
    public List<List<Integer>> subsets2(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());
        for (int num : nums) {
            List<List<Integer>> temps = new ArrayList<>();
            for (List<Integer> re : res){
                List<Integer> temp = new ArrayList<>(re);
                temp.add(num);
                temps.add(temp);
            }
            res.addAll(temps);
        }
        return res;
    }
    
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i <= nums.length; i++) {
            res.addAll(tool(nums, i));
        }

        return res;
    }

    public List<List<Integer>> tool(int[] nums, int n) {
        List<List<Integer>> res = new ArrayList<>();
        Deque<Integer> path = new ArrayDeque<>();
        dfs(nums, 0, n, path, res);
        return res;
    }

    public void dfs(int[] nums, int begin, int len, Deque<Integer> path, List<List<Integer>> res) {
        if (len == path.size()) {
            res.add(new ArrayList<>(path));
            return;
        }

        for (int i = begin; i < nums.length; i++) {
            path.addLast(nums[i]);
            dfs(nums, i + 1, len, path, res);
            path.removeLast();
        }
    }
}
