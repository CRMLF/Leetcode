package com.zl.jianzhi.day11;

/**
 * @Description
 * @Author ZhengLing
 * @Date 2022/03/06 13:59
 */
public class Day11_1 {

    public static void main(String[] args) {

    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    ListNode deleteNode(ListNode head, int val) {
        if (head.val == val) {
            return head.next;
        }
        ListNode res = head;
        while (head != null) {
            if (head.next != null) {
                if (head.next.val == val) {
                    head.next = head.next.next;
                    return res;
                }
            } else {
                return res;
            }
            head = head.next;
        }
        return null;
    }
}
