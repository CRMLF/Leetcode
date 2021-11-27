package com.zl.array.array0054;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author ZhengLing
 * @Date 2021/11/27 20:44
 */
public class Array0054 {
    public static void main(String[] args) {
        System.out.println(new Solution().spiralOrder(new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}}));
    }
}

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int row = matrix.length;
        int col = matrix[0].length;
        boolean[][] used = new boolean[row][col];
        int all = row * col;

        //方向：0 右；1 下；2 左；3 上
        int dir = 0;

        int num = 0;
        int i = 0;
        int j = 0;
        for (int k = 0; k < all; k++) {
            num = matrix[i][j];
            used[i][j] = true;
            res.add(num);
            //右
            if (0 == dir) {
                if (j < col - 1 && !used[i][j + 1]) {
                    j += 1;
                } else {
                    dir = (dir + 1) % 4;
                    i += 1;
                }
            }else 
            //下
            if (1 == dir) {
                if (i < row - 1 && !used[i + 1][j]) {
                    i += 1;
                } else {
                    dir = (dir + 1) % 4;
                    j -= 1;
                }
            }else 
            //左
            if (2 == dir) {
                if (j > 0 && !used[i][j - 1]) {
                    j -= 1;
                } else {
                    dir = (dir + 1) % 4;
                    i -= 1;
                }
            }else
            //上
            if (3 == dir) {
                if (i > 0 && !used[i - 1][j]) {
                    i -= 1;
                } else {
                    dir = (dir + 1) % 4;
                    j += 1;
                }
            }
        }

        return res;
    }
}