package com.zl.jianzhi.day10;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Description
 * @Author ZhengLing
 * @Date 2022/03/05 19:08
 */
public class Day10_1 {
    public static void main(String[] args) {
        System.out.println(new Day10_1().translateNum(12258));
        StringBuilder stringBuilder = new StringBuilder();
        StringBuffer stringBuffer = new StringBuffer();

    }

    public int translateNum(int num) {
        String s = Integer.toString(num);
        int len = s.length();
        int[] dp = new int[len + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= len; i++) {
            String temp = s.substring(i - 2, i);
            dp[i] = temp.compareTo("10") >= 0 && temp.compareTo("25") <= 0 ? dp[i - 1] + dp[i - 2] : dp[i - 1];

        }


        return dp[len];
    }
}

class DebugInvocationHandler implements InvocationHandler {

    private final Object target;

    public DebugInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before" + method.getName());
        Object result = method.invoke(target, args);
        System.out.println("after" + method.getName());
        return result;
    }
}
