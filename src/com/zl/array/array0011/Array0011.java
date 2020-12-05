package com.zl.array.array0011;

/**
 * @Description
 * @Author ZhengLing
 * @Date 2020/12/04 20:20
 */
public class Array0011 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(new Solution().maxArea(arr));
    }
}

class Solution {
    public int maxArea(int[] height) {
        int max = 0, l = 0, r = height.length - 1;
        while (l < r) {
            max = Math.max((r - l) * Math.min(height[l], height[r]), max);
            if (height[l] < height[r]) {
                l++;
            } else {
                r--;
            }
        }
        return max;
    }
}
