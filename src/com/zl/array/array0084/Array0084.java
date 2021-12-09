package com.zl.array.array0084;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

/**
 * @Description
 * @Author ZhengLing
 * @Date 2021/12/08 18:22
 */
public class Array0084 {
    public static void main(String[] args) {
        System.out.println(new Solution().largestRectangleArea2(new int[]{2, 1, 2}));
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

    public int largestRectangleArea2(int[] heights) {
        int max = heights[0];
        int len = heights.length;
        for (int i = 0; i < len; i++) {
            int left = i;
            int right = i;
            for (int j = i; j < len; j++) {
                if (heights[j] >= heights[i]) {
                    right = j;
                } else {
                    break;
                }
            }
            for (int j = i; j >= 0; j--) {
                if (heights[j] >= heights[i]) {
                    left = j;
                } else {
                    break;
                }
            }
            max = Math.max(max, (right - left + 1) * heights[i]);
            System.out.println(left + " " + right + " " + heights[i]);
        }
        return max;
    }

    public int largestRectangleArea3(int[] heights) {
        int max = heights[0];
        int len = heights.length;
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < len; i++) {
            while (!stack.isEmpty() && heights[i] < heights[stack.peekLast()]) {
                int height = heights[stack.removeLast()];

                while (!stack.isEmpty() && heights[stack.peekLast()] == height) {
                    stack.removeLast();
                }
                int width;
                if (stack.isEmpty()) {
                    width = i;
                } else {
                    width = i - stack.peekLast() - 1;
                }
                max = Math.max(max, height * width);
            }
            stack.addLast(i);
        }
        while (!stack.isEmpty()) {
            int height = heights[stack.removeLast()];

            while (!stack.isEmpty() && heights[stack.peekLast()] == height) {
                stack.removeLast();
            }
            int width;
            if (stack.isEmpty()) {
                width = len;
            } else {
                width = len - stack.peekLast() - 1;
            }
            max = Math.max(max, height * width);
        }
        return max;
    }
}
