package com.zl.linkedList.linkedList0002;

/**
 * @Description
 * @Author ZhengLing
 * @Date 2020/12/10 20:03
 */
public class LinkedList0002 {
    public static void main(String[] args) {

    }
}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode listNode = new ListNode();
        int carrying = 0;
        int sum = l1.val + l2.val;
        listNode.val = sum % 10;
        carrying = sum > 9 ? 1 : 0;

        if (l1.next != null&&l2.next!=null){
            l1 = l1.next;
            l2 = l2.next;
            sum = l1.val + l2.val + carrying;
            ListNode node = new ListNode();
            
        }

            return null;
    }
}
