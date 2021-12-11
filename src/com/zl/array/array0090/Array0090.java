package com.zl.array.array0090;

import java.util.*;

/**
 * @Description
 * @Author ZhengLing
 * @Date 2021/12/10 9:48
 */
public class Array0090 {
    public static void main(String[] args) {
        System.out.println(new Solution().subsetsWithDup2(new int[]{1, 2, 2}));
    }
}

class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        int len = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        Deque<Integer> path = new ArrayDeque<>();
        for (int i = 0; i <= len; i++) {
            dfs(nums, i, 0, path, res);
        }
        HashMap<List<Integer>, List<Integer>> map = new HashMap<>();
        for (List<Integer> re : res) {
            Collections.sort(re);
            map.put(re, re);
        }
        res.clear();
        res.addAll(map.values());
        return res;
    }

    public void dfs(int[] nums, int len, int begin, Deque<Integer> path, List<List<Integer>> res) {
        if (path.size() == len) {
            res.add(new ArrayList<>(path));
            return;
        }

        for (int i = begin; i < nums.length; i++) {
            path.addLast(nums[i]);
            dfs(nums, len, i + 1, path, res);
            path.removeLast();
        }
    }

    public List<List<Integer>> subsetsWithDup2(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());
        for (int num : nums) {
            List<List<Integer>> temps = new ArrayList<>();
            for (List<Integer> re:res){
                List<Integer> temp = new ArrayList<>(re);
                temp.add(num);
                temps.add(temp);
            }
            res.addAll(temps);
        }
        HashMap<List<Integer>,List<Integer>> map = new HashMap<>();
        for (List<Integer> re:res){
            map.put(re,re);
        }
        res.clear();
        res.addAll(map.values());
        return res;
    }
}