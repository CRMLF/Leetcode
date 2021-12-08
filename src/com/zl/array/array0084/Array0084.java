package com.zl.array.array0084;

/**
 * @Description
 * @Author ZhengLing
 * @Date 2021/12/08 18:22
 */
public class Array0084 {
    public static void main(String[] args) {
        System.out.println(new Solution().largestRectangleArea(new int[]{2,4}));
    }
}

class Solution {
    public int largestRectangleArea(int[] heights) {
        int max = heights[0];
        for (int i = 0; i < heights.length; i++) {
            for (int j = i; j < heights.length; j++) {
                int[] min = findMin(heights, i, j);
                max = Math.max(max, (j - i + 1) * min[1]);
            }
        }

        return max;
    }

    public int[] findMin(int[] heights, int start, int end) {
        int[] min = new int[]{start, heights[start]};
        for (int i = start; i <= end; i++) {
            if (heights[i] < min[1]) {
                min[0] = i;
                min[1] = heights[i];
            }
        }

        return min;
    }
}
