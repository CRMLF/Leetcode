package com.zl.jianzhi.day02;


import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/**
 * @Description
 * @Author ZhengLing
 * @Date 2022/02/23 20:51
 */
public class Day02_1 {
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(3);
        ListNode listNode3 = new ListNode(2);
        listNode1.next = listNode2;
        listNode2.next = listNode3;

        System.out.println(Arrays.toString(new Solution1().reversePrint(listNode1)));
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

class Solution1 {
    public int[] reversePrint(ListNode head) {
        Deque<Integer> deque = new ArrayDeque<>();
        if (head == null) {
            return new int[0];
        }

        deque.push(head.val);
        while (head.next != null) {
            head = head.next;
            deque.push(head.val);
        }

        int len = deque.size();
        int[] res = new int[len];
        for (int i = 0; i < len; i++) {
            res[i] = deque.pop();
        }
        return res;
    }
}