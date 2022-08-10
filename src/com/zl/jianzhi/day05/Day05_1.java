package com.zl.jianzhi.day05;

/**
 * @Description
 * @Author ZhengLing
 * @Date 2022/03/03 21:44
 */
public class Day05_1 {
    public static void main(String[] args) {
        System.out.println();
    }
}

class Solution {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        int row = matrix.length;
        if (row == 0) {
            return false;
        }
        int col = matrix[0].length;
        if (col == 0) {
            return false;
        }

        int i = 0;
        int j = col - 1;
        while (i >= 0 && i <= row - 1 && j >= 0 && j <= col - 1) {
            if (matrix[i][j] > target) {
                j--;
            } else if (matrix[i][j] < target) {
                i++;
            } else {
                return true;
            }
        }
        return false;
    }
}