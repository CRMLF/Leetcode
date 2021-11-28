package com.zl.array.array0056;

import java.util.*;

/**
 * @Description
 * @Author ZhengLing
 * @Date 2021/11/28 13:49
 */
public class Array0056 {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(new Solution().merge(new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}})));
    }
}

class Solution {
    public int[][] merge(int[][] intervals) {
        if (1 == intervals.length) {
            return intervals;
        }

        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));

        List<int[]> merged = new ArrayList<>();
        for (int[] interval : intervals) {
            int l = interval[0], r = interval[1];
            if (merged.size() == 0 || merged.get(merged.size() - 1)[1] < l) {
                merged.add(new int[]{l, r});
            } else {
                merged.get(merged.size() - 1)[1] = Math.max(merged.get(merged.size() - 1)[1], r);
            }
        }
        return merged.toArray(new int[merged.size()][]);


    }
}
