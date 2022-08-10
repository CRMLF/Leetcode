package com.zl.jianzhi.day02;


import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

/**
 * @Description
 * @Author ZhengLing
 * @Date 2022/02/23 21:12
 */
public class Day02_2 {
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(3);
        ListNode listNode3 = new ListNode(2);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        ListNode listNode = new Solution2().reverseList(listNode1);
        while (null != listNode) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
}

class Solution2 {
    public ListNode reverseList(ListNode head) {

        if (null == head) {
            return null;
        }

        Deque<Integer> deque = new ArrayDeque<>();
        deque.push(head.val);
        while (null != head.next) {
            head = head.next;
            deque.push(head.val);
        }
        ListNode res = new ListNode(deque.pop());
        ListNode res1 = res;


        while (!deque.isEmpty()) {
            res.next = new ListNode(deque.pop());
            res = res.next;
        }

        return res1;
    }
}