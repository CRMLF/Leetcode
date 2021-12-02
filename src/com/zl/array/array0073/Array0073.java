package com.zl.array.array0073;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Description
 * @Author ZhengLing
 * @Date 2021/12/01 17:44
 */
public class Array0073 {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
        new Solution().setZeroes(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }
}

class Solution {
    public void setZeroes(int[][] matrix) {
        List<Integer> row = new ArrayList<>();
        List<Integer> col = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (0 == matrix[i][j]) {
                    row.add(i);
                    col.add(j);
                }
            }
        }
        for (int i = 0; i < row.size(); i++) {
            int r = row.get(i);
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[r][j] = 0;
            }
        }
        for (int i = 0; i < row.size(); i++) {
            int c = col.get(i);
            for (int j = 0; j < matrix.length; j++) {
                matrix[j][c] = 0;
            }
        }
    }
}
