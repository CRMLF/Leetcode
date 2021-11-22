package com.zl.array.array0046;

import java.util.*;

/**
 * @Description
 * @Author ZhengLing
 * @Date 2021/11/19 18:20
 */
public class Array0046 {
    public static void main(String[] args) {
        System.out.println(new Solution().permute(new int[]{1, 2, 4}));
    }
}

class Solution {
    public List<List<Integer>> permute(int[] nums) {

        int len = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        if (0 == len) {
            return res;
        }

        boolean[] used = new boolean[len];
        List<Integer> path = new ArrayList<>();
        dfs(nums, len, 0, path, used, res);

        return res;
    }

    public void dfs(int[] nums, int len, int depth, List<Integer> path, boolean[] used, List<List<Integer>> res) {
        if (len == depth) {
            res.add(new ArrayList<>(path));
            return;
        }

        for (int i = 0; i < len; i++) {
            if (!used[i]) {
                path.add(nums[i]);
                used[i] = true;

                dfs(nums, len, depth + 1, path, used, res);
                used[i] = false;
                path.remove(path.size() - 1);
            }


        }
    }
}