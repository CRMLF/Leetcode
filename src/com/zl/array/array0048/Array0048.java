package com.zl.array.array0048;

import sun.nio.cs.ext.MacArabic;

import java.util.Arrays;

/**
 * @Description
 * @Author ZhengLing
 * @Date 2021/11/24 21:01
 */
public class Array0048 {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        new Solution().rotate2(matrix);
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
}

class Solution {
    public void rotate(int[][] matrix) {
        int[][] matrixCopy = new int[matrix.length][matrix.length];


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrixCopy[j][matrix.length - i - 1] = matrix[i][j];
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = matrixCopy[i][j];
            }
        }
    }

    public void rotate2(int[][] matrix) {
        int len = matrix.length;
        int[] temp;
        for (int i = 0; i < matrix.length / 2; i++) {
            temp = matrix[i];
            matrix[i] = matrix[len - i - 1];
            matrix[len - i - 1] = temp;
        }
        int temp2;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix.length; j++) {
                temp2 = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp2;
            }
        }

    }
}
