package com.zl.array.array0063;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Description
 * @Author ZhengLing
 * @Date 2021/12/01 15:54
 */
public class Array0063 {
    public static void main(String[] args) {
        System.out.println(new Solution().uniquePathsWithObstacles(new int[][]{{0,0,0},{0,1,0},{0,0,0}}));
    }
}

class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int[][] road = new int[obstacleGrid.length][obstacleGrid[0].length];
        int row = obstacleGrid.length;
        int col = obstacleGrid[0].length;
        for (int i = 0; i < col; i++) {
            if (obstacleGrid[0][i] == 1) {
                break;
            } else {
                road[0][i] = 1;
            }
        }

        for (int i = 0; i < row; i++) {
            if (obstacleGrid[i][0] == 1) {
                break;
            } else {
                road[i][0] = 1;
            }
        }

        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                if (obstacleGrid[i][j] == 1) {
                    road[i][j] = 0;
                } else {
                    road[i][j] = road[i - 1][j] + road[i][j - 1];
                }
            }
        }

        return road[row - 1][col - 1];

    }
}
