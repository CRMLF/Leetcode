package com.zl.everyday.e0419;

/**
 * @Description
 * @Author ZhengLing
 * @Date 2021/12/18 9:31
 */
public class E0419 {
    public static void main(String[] args) {
        System.out.println(new Solution().countBattleships(new char[][]{{'X','.','.','X'},{'.','.','.','X'},{'.','.','.','X'}}));
    }
}

class Solution {
    public int countBattleships(char[][] board) {
        int row = board.length;
        int col = board[0].length;
        int ans = 0;
        for (char[] chars : board) {
            int max = 0;
            for (int j = 0; j < col; j++) {
                if ('X' == chars[j]) {
                    max += 1;
                    j += 1;
                }
            }
            ans = Math.max(ans, max);
        }
        for (int j = 0; j < col; j++) {
            int max = 0;
            for (int i = 0; i < row; i++) {
                if ('X'==board[i][j]){
                    max+=1;
                    i+=1;
                }
            }
            ans=Math.max(ans,max);
        }
        return ans;
    }
}

                