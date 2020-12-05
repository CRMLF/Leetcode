package com.zl.array.array0004;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @Description
 * @Author ZhengLing
 * @Date 2020/12/04 15:49
 */
public class Array0004 {
    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2};
        int[] nums2 = new int[]{3, 4, 5, 6};

        System.out.println(new Solution().findMedianSortedArrays(nums1, nums2));
    }
}

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int start1 = 0;
        int start2 = 0;

        for (int i = 0; i < nums1.length; i++) {
            arrayList.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            arrayList.add(nums2[i]);
        }

        Comparator c = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                // TODO Auto-generated method stub
                if((int)o1<(int)o2)
                    return 1;
                    //注意！！返回值必须是一对相反数，否则无效。jdk1.7以后就是这样。
                    //		else return 0; //无效
                else return -1;
            }
        };
        Collections.sort(arrayList);

//        while (start1 < nums1.length && start2 < nums2.length) {
//            if (nums1[start1] <= nums2[start2]) {
//                arrayList.add(nums1[start1]);
//                start1++;
//            } else {
//                arrayList.add(nums2[start2]);
//                start2++;
//            }
//        }
//
//        for (; start1 < nums1.length; start1++) {
//            arrayList.add(nums1[start1]);
//        }
//        for (; start2 < nums2.length; start2++) {
//            arrayList.add(nums2[start2]);
//        }
        System.out.println(arrayList);

        if (arrayList.size() % 2 == 0) {
            return (arrayList.get(arrayList.size() / 2 - 1) + arrayList.get(arrayList.size() / 2)) / 2.0;

        } else {
            return arrayList.get((arrayList.size() - 1) / 2);
        }
    }
}
