package com.zl.array.array0085;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

/**
 * @Description
 * @Author ZhengLing
 * @Date 2021/12/10 9:08
 */
public class Array0085 {
    public static void main(String[] args) {
        System.out.println(new Solution().maximalRectangle(new char[][]{{'1', '0', '1', '0', '0'}, {'1', '0', '1', '1', '1'}, {'1', '1', '1', '1', '1'}, {'1', '0', '0', '1', '0'}}));

    }
}

class Solution {
    public int maximalRectangle(char[][] matrix) {
        if (matrix.length == 0) {
            return 0;
        }
        int max = 0;
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] nums = new int[row][col];
        for (int i = 0; i < row; i++) {
            if (matrix[i][0] == '1') {
                nums[i][0] = 1;
            }
            for (int j = 1; j < col; j++) {
                if (matrix[i][j] == '1') {
                    nums[i][j] = nums[i][j - 1] + 1;
                }
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (0 == nums[i][j]) {
                    continue;
                }
                int width = nums[i][j];
                max = Math.max(max, width);
                for (int k = i - 1; k >= 0; k--) {
                    width = Math.min(width, nums[k][j]);
                    max = Math.max(max, (i - k + 1) * width);
                }
            }
        }
        return max;
    }


    public int maximalRectangle2(char[][] matrix) {
        int m = matrix.length;
        if (m == 0) {
            return 0;
        }
        int n = matrix[0].length;
        int[][] left = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == '1') {
                    left[i][j] = (j == 0 ? 0 : left[i][j - 1]) + 1;
                }
            }
        }

        int ret = 0;
        // 对于每一列，使用基于柱状图的方法
        for (int j = 0; j < n; j++) { 
            int[] up = new int[m];
            int[] down = new int[m];

            Deque<Integer> stack = new LinkedList<Integer>();
            for (int i = 0; i < m; i++) {
                while (!stack.isEmpty() && left[stack.peek()][j] >= left[i][j]) {
                    stack.pop();
                }
                up[i] = stack.isEmpty() ? -1 : stack.peek();
                stack.push(i);
            }
            stack.clear();
            for (int i = m - 1; i >= 0; i--) {
                while (!stack.isEmpty() && left[stack.peek()][j] >= left[i][j]) {
                    stack.pop();
                }
                down[i] = stack.isEmpty() ? m : stack.peek();
                stack.push(i);
            }

            for (int i = 0; i < m; i++) {
                int height = down[i] - up[i] - 1;
                int area = height * left[i][j];
                ret = Math.max(ret, area);
            }
        }
        return ret;
    }
}

