package com.zl.jianzhi.day12;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @Description
 * @Author ZhengLing
 * @Date 2022/03/06 15:05
 */
public class Day12_2 {


    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode PA = headA;
        ListNode PB = headB;
        while (PA != PB) {
            PA = PA == null ? headB : PA.next;
            PB = PB == null ? headA : PB.next;
        }
        return PA;
    }

    public ListNode getIntersectionNode1(ListNode headA, ListNode headB) {
        HashSet<ListNode> set = new HashSet<>();
        while (null != headA) {
            set.add(headA);
            headA = headA.next;
        }

        while (null != headB) {
            if (set.contains(headB)) {
                return headB;
            }
            headB = headB.next;
        }
        return null;
    }


    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

}
