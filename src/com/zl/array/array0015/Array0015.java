package com.zl.array.array0015;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Description
 * @Author ZhengLing
 * @Date 2020/12/05 13:55
 */
public class Array0015 {
    public static void main(String[] args) {
        System.out.println(new Solution().threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
    }
}

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums == null || nums.length < 3) {
            return res;
        }

        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if(nums[i]>0) break;
            if(i > 0 && nums[i] == nums[i-1]) continue;
            int l = i + 1, r = nums.length - 1;
            while (l < r) {
                if (nums[l] + nums[i] + nums[r] == 0) {
                    System.out.println(l + " " + i + " " + r);
                    res.add(Arrays.asList(nums[l], nums[i], nums[r]));
                    while (nums[l] == nums[l + 1] && l < r) l++;
                    while (nums[r] == nums[r - 1] && l < r) r--;
                    l++;
                    r--;
                } else if (nums[l] + nums[i] + nums[r] > 0) {
                    r--;
                } else {
                    l++;
                }

            }

        }
        return res;
    }
}
