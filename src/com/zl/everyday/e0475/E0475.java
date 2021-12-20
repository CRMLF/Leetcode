package com.zl.everyday.e0475;

import java.util.Arrays;

/**
 * @Description
 * @Author ZhengLing
 * @Date 2021/12/20 9:42
 */
public class E0475 {
    public static void main(String[] args) {
        System.out.println(new Solution().findRadius(new int[]{1, 5}, new int[]{2}));
    }
}

class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        int len = houses.length;
        int[] distances = new int[len];
        for (int i = 0; i < len; i++) {
            int min = Integer.MAX_VALUE;
            for (int heater : heaters) {
                min = Math.min(min, Math.abs(houses[i] - heater));
            }
            distances[i] = min;
        }
        Arrays.sort(distances);
        return distances[len - 1];
    }

    public int findRadius2(int[] houses, int[] heaters) {
        int ans = 0, d = (int) 2e9;
        Arrays.sort(heaters);
        //评论中看到的一句话精华：对于每个房屋，要么用前面的暖气，要么用后面的，二者取近的，得到距离
        for (int i = 0; i < houses.length; i++) {
            if (houses[i] <= heaters[0]) {
                d = heaters[0] - houses[i];
            } else if (houses[i] >= heaters[heaters.length - 1]) {
                d = houses[i] - heaters[heaters.length - 1];
            } else {
                int l = 0, r = heaters.length - 1;
                while (l < r) {
                    int mid = (l + r) >> 1;
                    if (heaters[mid] < houses[i]) {
                        l = mid + 1;
                    } else {
                        r = mid;
                    }
                }
                d = Math.min(heaters[l] - houses[i], houses[i] - heaters[l - 1]);
            }
            ans = Math.max(ans, d);
        }
        return ans;
    }
}
