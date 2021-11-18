package com.zl.array.array0036;

/**
 * @Description
 * @Author ZhengLing
 * @Date 2021/11/18 20:48
 */
public class Array0036 {
    public static void main(String[] args) {
        char[][] board = new char[9][];
        board[0] = new char[]{'5','3','.','.','7','.','.','.','.'};
        board[1] = new char[]{'6','.','.','1','9','5','.','.','.'};
        board[2] = new char[]{'.','9','8','.','.','.','.','6','.'};
        board[3] = new char[]{'8','.','.','.','6','.','.','.','3'};
        board[4] = new char[]{'4','.','.','8','.','3','.','.','1'};
        board[5] = new char[]{'7','.','.','.','2','.','.','.','6'};
        board[6] = new char[]{'.','6','.','.','.','.','2','8','.'};
        board[7] = new char[]{'.','.','.','4','1','9','.','.','5'};
        board[8] = new char[]{'.','.','.','.','8','.','.','7','9'};

        System.out.println(new Solution().isValidSudoku(board));
    }
}

class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {

                    //同一行
                    for (int k = 0; k < 9; k++) {
                        if (board[i][k] == board[i][j] && k != j) {
                            return false;
                        }
                    }

                    //同一列
                    for (int k = 0; k < 9; k++) {
                        if (board[k][j] == board[i][j] && k != i) {
                            return false;
                        }
                    }

                    //同一个九宫格
                    int h = i / 3 * 3;
                    int l = j / 3 * 3;
                    for (int k = h; k < h + 3; k++) {
                        for (int m = l; m < l + 3; m++) {
                            if (i == k && j == m) {
                            } else {
                                if (board[k][m] == board[i][j]) {
                                    return false;
                                }
                            }
                        }
                    }
                    
                    
                }
            }
        }
        return true;
    }
}