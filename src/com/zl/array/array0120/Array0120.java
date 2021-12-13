package com.zl.array.array0120;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author ZhengLing
 * @Date 2021/12/13 14:53
 */
public class Array0120 {
    public static void main(String[] args) {
        List<Integer> num1 = new ArrayList<>();
        List<Integer> num2 = new ArrayList<>();
        List<Integer> num3 = new ArrayList<>();
        List<Integer> num4 = new ArrayList<>();
        List<List<Integer>> nums = new ArrayList<>();
        num1.add(2);
        nums.add(num1);

        num2.add(3);
        num2.add(4);
        nums.add(num2);

        num3.add(6);
        num3.add(5);
        num3.add(7);
        nums.add(num3);

        num4.add(4);
        num4.add(1);
        num4.add(8);
        num4.add(3);
        nums.add(num4);
        System.out.println(nums);
        System.out.println(new Solution().minimumTotal(nums));
    }
}

class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        List<List<Integer>> len = new ArrayList<>();
        List<Integer> one = new ArrayList<>();
        one.add(triangle.get(0).get(0));
        len.add(one);

        for (int i = 1; i < triangle.size(); i++) {
            List<Integer> temp = new ArrayList<>();
            for (int j = 0; j < triangle.get(i).size(); j++) {
                if (j == 0) {
                    temp.add(len.get(i - 1).get(0) + triangle.get(i).get(j));
                } else if (j == triangle.get(i).size() - 1) {
                    temp.add(len.get(i - 1).get(triangle.get(i).size() - 2) + triangle.get(i).get(j));
                } else {
                    temp.add(Math.min(len.get(i - 1).get(j - 1), len.get(i - 1).get(j)) + triangle.get(i).get(j));
                }
            }
            len.add(temp);
        }
//        System.out.println(len);
        List<Integer> lastRow = len.get(triangle.size() - 1);
        int ans = lastRow.get(0);
        for (int num : lastRow) {
            ans = Math.min(ans, num);
        }
        return ans;
    }

    public int minimumTotal2(List<List<Integer>> triangle) {
        List<Integer> dp = triangle.get(triangle.size() - 1);
        for (int i = triangle.size() - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                dp.set(j, Math.min(dp.get(j), dp.get(j + 1)) + triangle.get(i).get(j));
            }
        }
        return dp.get(0);
    }
} 

