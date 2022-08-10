package com.zl.jianzhi.day11;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @Description
 * @Author ZhengLing
 * @Date 2022/03/06 14:07
 */
public class Day11_2 {
    public static void main(String[] args) {

    }

    public ListNode getKthFromEnd(ListNode head, int k) {
        Deque<ListNode> deque = new ArrayDeque<>();
        while (head != null) {
            deque.push(head);
            head = head.next;
        }

        for (int i = 1; i < k; i++) {
            deque.pop();
        }
        return deque.pop();
    }


    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

}
