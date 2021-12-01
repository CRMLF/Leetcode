package com.zl.array.array0066;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @Description
 * @Author ZhengLing
 * @Date 2021/12/01 16:52
 */
public class Array0066 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().plusOne(new int[]{4, 3, 2, 1})));
    }
}

class Solution {
    public int[] plusOne(int[] digits) {
        StringBuilder strNum = new StringBuilder();
        for (int digit : digits) {
            strNum.append(digit);
        }
        BigInteger bigInteger = new BigInteger(String.valueOf(strNum));
        bigInteger = bigInteger.add(new BigInteger("1"));
        
        List<Integer> resList = new ArrayList<>();
        BigInteger bigIntegerZero = new BigInteger("0");
        BigInteger bigIntegerTen = new BigInteger("10");
        
        while (!bigInteger.equals(bigIntegerZero)){
            resList.add(bigInteger.remainder(bigIntegerTen).intValue());
            bigInteger = bigInteger.divide(bigIntegerTen);
        }
        Collections.reverse(resList);

        return resList.stream().mapToInt(Integer::intValue).toArray();
    }
}