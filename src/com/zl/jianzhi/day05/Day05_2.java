package com.zl.jianzhi.day05;

/**
 * @Description
 * @Author ZhengLing
 * @Date 2022/03/03 22:05
 */
public class Day05_2 {
    public static void main(String[] args) {
        System.out.println();
    }
}

class Solution1 {
    public int minArray(int[] numbers) {
        int len = numbers.length;
        int left = 0;
        int right = len - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (numbers[mid] < numbers[right]) {
                right = mid;
            } else if (numbers[mid] > numbers[right]) {
                left = mid + 1;
            } else {
                right--;
            }
        }
        return numbers[left];
    }
}

