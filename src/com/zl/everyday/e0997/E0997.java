package com.zl.everyday.e0997;

/**
 * @Description
 * @Author ZhengLing
 * @Date 2021/12/19 9:14
 */
public class E0997 {
    public static void main(String[] args) {
        System.out.println(new Solution().findJudge(2, new int[][]{{1, 2}}));
    }
}

class Solution {
    public int findJudge(int n, int[][] trust) {
        int[][] people = new int[n + 1][2];
        for (int[] temp : trust) {
            people[temp[0]][0] = 1;
            people[temp[1]][1] += 1;
        }
        for (int i = 1; i <= n; i++) {
            if (people[i][0] == 0 && people[i][1] == n - 1) {
                return i;
            }

        }
        return -1;
    }
}