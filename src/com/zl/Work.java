package com.zl;

import java.util.Scanner;

/**
 * @Description 
 * @Author
 * @Date 2020/12/13 14:50
 */
public class Work {

    private static int[] father = new int[10001];
    private static boolean[] mark = new boolean[10001];
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int n;
        while ((n = scan.nextInt()) != 0) {
            for (int i = 1; i <= n; i++) {
                father[i] = i;
                mark[i] = false;
            }
            String[] strArr;
            String str;
            do { 
                //取出每组的字符
                strArr = scan.next().split(" ");
                str = strArr[0];
            } while (order(str, n));
        }
    }
    
    //给定相应的字符作出相应的指令
    public static boolean order(String str, int n) {
        if ("C".equals(str)) {
            check();
        } else if ("I".equals(str)) {
            connect();
        } else if ("S".equals(str)) {
            judge(n);
            return false;
        }
        return true;
    }

    //找到根节点
    public static int find(int x) {
        if (x == father[x]) {
            return x;
        } else {
            return find(father[x]);
        }
    }

    //判断网络中任意两点之间是否可以传输文件
    public static void judge(int n) {
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            int f = find(i);
            //两个根节点不同，并且另外一个根节点未标记，则连通集+1。 
            if (!mark[f]) {
                mark[f] = true;
                cnt++;
            }
        }
        if (cnt != 1) {
            System.out.printf("There are %d components.\n\n", cnt);
        } else {
            System.out.printf("The network is connected.\n\n");
        }
    }
    
    //将给定两点连接
    public static void connect() {
        int a, b;
        a = scan.nextInt();
        b = scan.nextInt();
        int x = find(a), y = find(b);
        //a,b两点的根节点已经相同，已经相连。 
        if (x == y) {
            return;
        }
        //将x的根节点更新为y，向x，y两个集合左归并为x一个。 
        father[y] = x;
    }

    //判断给定两点之间是否可以传输文件
    public static void check() {
        int a, b;
        a = scan.nextInt();
        b = scan.nextInt();
        int x = find(a), y = find(b);
        if (y == x) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}


