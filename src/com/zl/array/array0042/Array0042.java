package com.zl.array.array0042;

import java.util.Arrays;

/**
 * @Description
 * @Author ZhengLing
 * @Date 2021/11/19 16:24
 */
public class Array0042 {
    public static void main(String[] args) {
        System.out.println(new Solution2().trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
    }
}


class Solution {
    public int trap(int[] height) {
        int total = 0;
        for (int i = 1; i < height.length - 1; i++) {
            int lMax = height[i];
            int rMax = height[i];
            for (int j = 0; j < i; j++) {
                if (height[j] > lMax) {
                    lMax = height[j];
                }
            }
            for (int j = i + 1; j < height.length; j++) {
                if (height[j] > rMax) {
                    rMax = height[j];
                }
            }
            int max = Math.min(rMax, lMax);
            if (max > height[i]) {
                total += max - height[i];
            }
        }
        return total;
    }
}

class Solution2 {
    public int trap(int[] height) {
        if (height == null || height.length == 0)
            return 0;
        int ans = 0;
        int size = height.length;
        int[] leftMax = new int[size];
        int[] rightMax = new int[size];
        leftMax[0] = height[0];
        for (int i = 1; i < size; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }
        rightMax[size - 1] = height[size - 1];
        for (int i = size - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }
        for (int i = 1; i < size - 1; i++) {
            ans += Math.min(leftMax[i], rightMax[i]) - height[i];
        }
        return ans;
    }
}