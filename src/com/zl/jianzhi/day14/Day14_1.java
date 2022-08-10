package com.zl.jianzhi.day14;

import java.util.HashSet;
import java.util.Hashtable;

/**
 * @Description
 * @Author ZhengLing
 * @Date 2022/03/08 16:58
 */
public class Day14_1 {

    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        Integer[] integers = set.toArray(set.toArray(new Integer[0]));
    }

    public boolean exist(char[][] board, String word) {
        int row = board.length;
        if (row == 0) {
            return false;
        }
        int col = board[0].length;
        if (col == 0) {
            return false;
        }

        boolean[][] used = new boolean[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

            }
        }


        return false;
    }
}
