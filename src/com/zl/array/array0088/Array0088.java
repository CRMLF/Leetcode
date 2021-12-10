package com.zl.array.array0088;

import java.util.Arrays;

/**
 * @Description
 * @Author ZhengLing
 * @Date 2021/12/10 9:28
 */
public class Array0088 {
    public static void main(String[] args) {
        int[] nums1 = new int[]{1};
        int[] nums2 = new int[]{};
        new Solution().merge(nums1, 1, nums2, 0);
        System.out.println(Arrays.toString(nums1));
    }
}

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums3 = Arrays.copyOf(nums1, m);
        int num3L = 0;
        int num2L = 0;
        while (num3L < m && num2L < n) {
            if (nums3[num3L] <= nums2[num2L]) {
                nums1[num2L + num3L] = nums3[num3L];
                num3L++;
            } else {
                nums1[num2L + num3L] = nums2[num2L];
                num2L++;
            }
        }
        if (num3L < m) {
            for (int i = num3L; i < m; i++) {
                nums1[num3L+num2L]=nums3[num3L];
                num3L++;
            }
        }
        if (num2L < n) {
            for (int i = num2L; i < n; i++) {
                nums1[num3L+num2L]=nums2[num2L];
                num2L++;
            }
        }
    }
}
