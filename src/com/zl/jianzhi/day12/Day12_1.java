package com.zl.jianzhi.day12;

/**
 * @Description
 * @Author ZhengLing
 * @Date 2022/03/06 14:35
 */
public class Day12_1 {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (null == l1 && null != l2) {
            return l2;
        }
        if (null != l1 && null == l2) {
            return l1;
        }
        if (null == l1 && null == l2) {
            return null;
        }
        ListNode res;
        if (l1.val > l2.val) {
            ListNode temp = l1;
            l1 = l2;
            l2 = temp;
        }
        res = new ListNode(l1.val);
        ListNode res1 = res;
        l1 = l1.next;
        while (null != l1 && null != l2) {
            if (l1.val > l2.val) {
                res.next = l2;
                res = res.next;
                l2 = l2.next;
            } else {
                res.next = l1;
                res = res.next;
                l1 = l1.next;
            }
        }
        if (null != l1) {
            res.next = l1;
        }
        if (null != l2) {
            res.next = l2;
        }

        return res1;

    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
