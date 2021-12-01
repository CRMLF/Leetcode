package com.zl.array.array0064;

import java.util.Arrays;

/**
 * @Description
 * @Author ZhengLing
 * @Date 2021/12/01 16:38
 */
public class Array0064 {
    public static void main(String[] args) {
        System.out.println(new Solution().minPathSum(new int[][]{{1, 3, 1}, {1, 5, 1}, {4, 2, 1}}));
    }
}

class Solution {
    public int minPathSum(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int[][] road = new int[row][col];
        road[0][0] = grid[0][0];
        for (int i = 1; i < col; i++) {
            road[0][i] = road[0][i - 1] + grid[0][i];
        }
        for (int i = 1; i < row; i++) {
            road[i][0] = road[i - 1][0] + grid[i][0];
        }

        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                road[i][j] = Math.min(road[i - 1][j], road[i][j - 1]) + grid[i][j];
            }
        }

        return road[row - 1][col - 1];
    }
}
