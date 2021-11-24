package com.zl.array.array0047;

import java.util.*;

/**
 * @Description
 * @Author ZhengLing
 * @Date 2021/11/19 18:20
 */
public class Array0047 {
    public static void main(String[] args) {
        System.out.println(new Solution().permuteUnique(new int[]{1, 1, 2}));
    }
}

class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {

        int len = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        HashMap<List<Integer>, List<Integer>> resHashMap = new HashMap<>();
        if (0 == len) {
            return res;
        }
        


        boolean[] used = new boolean[len];
        List<Integer> path = new ArrayList<>();
        dfs(nums, len, 0, path, used, resHashMap);
        for (List<Integer> value : resHashMap.values()) {
            res.add(value);
        }
        return res;
    }

    public void dfs(int[] nums, int len, int depth, List<Integer> path, boolean[] used, HashMap<List<Integer>, List<Integer>> resHashMap) {
        if (len == depth) {
            resHashMap.put(new ArrayList<>(path), new ArrayList<>(path));
            return;
        }

        for (int i = 0; i < len; i++) {
            if (!used[i]) {
                path.add(nums[i]);
                used[i] = true;

                dfs(nums, len, depth + 1, path, used, resHashMap);
                used[i] = false;
                path.remove(path.size() - 1);
            }


        }
    }
}