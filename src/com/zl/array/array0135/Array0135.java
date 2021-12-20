package com.zl.array.array0135;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author ZhengLing
 * @Date 2021/12/20 10:03
 */
public class Array0135 {
    public static void main(String[] args) {
        System.out.println(new Solution().candy(new int[]{1, 3, 2, 2, 1}));
    }
}

class Solution {
    public int candy(int[] ratings) {
        int len = ratings.length;
        int[] left = new int[len];
        for (int i = 0; i < len; i++) {
            if (i > 0 && ratings[i] > ratings[i - 1]) {
                left[i] = left[i - 1] + 1;
            } else {
                left[i] = 1;
            }
        }
        int right = 0, ret = 0;
        for (int i = len - 1; i >= 0; i--) {
            if (i < len - 1 && ratings[i] > ratings[i + 1]) {
                right++;
            } else {
                right = 1;
            }
            ret += Math.max(left[i], right);
        }
        return ret;
    }
}