package com.zl.everyday.e1154;

/**
 * @Description
 * @Author ZhengLing
 * @Date 2021/12/21 20:42
 */
public class E1154 {
    public static void main(String[] args) {
        System.out.println(new Solution().dayOfYear("2019-02-10"));
    }
}

class Solution {
    public int dayOfYear(String date) {
        int year = Integer.parseInt(date.substring(0, 4));
        int month = Integer.parseInt(date.substring(5, 7));
        int day = Integer.parseInt(date.substring(8));

        int[] amount = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            ++amount[1];
        }

        int ans = 0;
        for (int i = 0; i < month - 1; ++i) {
            ans += amount[i];
        }
        return ans + day;
    }
}
