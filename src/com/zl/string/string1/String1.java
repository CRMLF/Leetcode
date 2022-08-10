package com.zl.string.string1;

import java.util.Scanner;

/**
 * @Description
 * @Author ZhengLing
 * @Date 2022/02/21 20:17
 */
public class String1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while (n-- >= 0) {
            char[] charsArray = scanner.nextLine().toCharArray();
            int len = charsArray.length;
            for (int i = 2; i < len; i++) {
                if (charsArray[i - 1] == charsArray[i - 2]) {
                    if (charsArray[i - 1] == charsArray[i]) {
                        
                    }
                }
            }
        }
    }

    private String solution(String str) {
        return null;
    }
}
