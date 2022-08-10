package com.zl.jianzhi.day02;

import com.sun.javafx.collections.MappingChange;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @Description
 * @Author ZhengLing
 * @Date 2022/02/23 21:43
 */
public class Day02_3 {
    public static void main(String[] args) {
        Node node1 = new Node(7);
        Node node2 = new Node(13);
        Node node3 = new Node(11);
        Node node4 = new Node(10);
        Node node5 = new Node(1);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node2.random = node1;
        node3.random = node5;
        node4.random = node3;
        node5.random = node1;

        Node node = new Solution().copyRandomList(node1);
        System.out.println(node.val);
    }
}

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

class Solution {
    public Node copyRandomList(Node head) {
        if (null == head) {
            return null;
        }

        Node cur = head;
        HashMap<Node, Node> map = new HashMap<>();
        while (null != cur) {
            map.put(cur, new Node(cur.val));
            cur = cur.next;
        }

        cur = head;
        while (null != cur) {
            map.get(cur).next = map.get(cur.next);
            map.get(cur).random = map.get(cur.random);
            cur = cur.next;
        }
        return map.get(head);

    }
}
