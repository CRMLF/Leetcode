package com.zl.array.array0057;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @Description
 * @Author ZhengLing
 * @Date 2021/11/28 15:08
 */
public class Array0057 {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(new Solution().insert(new int[][]{{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}}, new int[]{4, 8})));
    }
}

class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int len = intervals.length;
        int[][] newIntervals = new int[len + 1][];
        System.arraycopy(intervals, 0, newIntervals, 0, len);
        newIntervals[len] = newInterval;
        return merge(newIntervals);

    }

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