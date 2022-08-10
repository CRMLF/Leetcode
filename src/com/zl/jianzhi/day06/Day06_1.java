package com.zl.jianzhi.day06;

import java.util.*;

/**
 * @Description
 * @Author ZhengLing
 * @Date 2022/03/04 14:51
 */
public class Day06_1 {
}


class Solution {
    public int[] levelOrder(TreeNode root) {
        if (null == root) {
            return new int[0];
        }
        List<Integer> res = new ArrayList<>();
        Deque<TreeNode> deque = new ArrayDeque<>();
        deque.push(root);
        while (deque.size() > 0) {
            TreeNode temp = deque.pop();
            res.add(temp.val);
            if (null != temp.left) {
                deque.add(temp.left);
            }

            if (null != temp.right) {
                deque.add(temp.right);
            }
        }

        return res.stream().mapToInt(i -> i).toArray();
    }

    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}