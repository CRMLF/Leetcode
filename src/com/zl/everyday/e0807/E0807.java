package com.zl.everyday.e0807;

/**
 * @Description
 * @Author ZhengLing
 * @Date 2021/12/13 9:56
 */
public class E0807 {
    public static void main(String[] args) {
        System.out.println();
    }
}

class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int ans = 0;
        int row = grid.length;
        int col = grid[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int rowMax = grid[i][j];
                int colMax = grid[i][j];
                for (int k = 0; k < col; k++) {
                    rowMax = Math.max(rowMax, grid[i][k]);
                }
                for (int[] ints : grid) {
                    colMax = Math.max(colMax, ints[j]);
                }

                ans += Math.min(rowMax, colMax) - grid[i][j];
            }
        }
        return ans;
    }

    public int maxIncreaseKeepingSkyline2(int[][] grid) {
        int ans = 0;
        int row = grid.length;
        int col = grid[0].length;
        int[] rowMax = new int[row];
        int[] colMax = new int[col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                rowMax[i] = Math.max(rowMax[i], grid[i][j]);
                colMax[j] = Math.max(colMax[j], grid[i][j]);
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                ans += Math.min(rowMax[i], colMax[j]) - grid[i][j];

            }

        }
        return ans;
    }
}
