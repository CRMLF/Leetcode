package com.zl.array.array0074;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author ZhengLing
 * @Date 2021/12/01 20:55
 */
public class Array0074 {
    public static void main(String[] args) {
        System.out.println(new Solution().searchMatrix(new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}}, 10));
    }
}

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix[0][0] > target || matrix[matrix.length - 1][matrix[0].length - 1] < target) {
            return false;
        }
        int row = matrix.length;
        int col = matrix[0].length;
        List<Integer> end = new ArrayList<>();
        for (int[] ints : matrix) {
            end.add(ints[col - 1]);
        }

        int left = 0;
        int right = row - 1;
        int mid1 = 0;
        while (left <= right) {
            mid1 = (left + right) / 2;
            if (end.get(mid1) > target) {
                right = mid1 - 1;
            } else if (end.get(mid1) < target) {
                left = mid1 + 1;
            } else {
                break;
            }
        }
        if (matrix[mid1][col - 1] < target) {
            mid1 += 1;
        }

        int mid2 = 0;
        left = 0;
        right = col - 1;
        while (left <= right) {
            mid2 = (left + right) / 2;
            if (matrix[mid1][mid2] > target) {
                right = mid2 - 1;
            } else if (matrix[mid1][mid2] < target) {
                left = mid2 + 1;
            } else {
                break;
            }
        }

        return matrix[mid1][mid2] == target;
    }
}
