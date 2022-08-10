package com.zl.jianzhi.day06;

import com.zl.jianzhi.day04.Day04_1;

import java.util.*;

/**
 * @Description
 * @Author ZhengLing
 * @Date 2022/03/04 15:10
 */
public class Day06_2 {
}

class Solution1 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (null == root) {
            return new ArrayList<>();
        }
        List<List<Integer>> res = new ArrayList<>();
        Deque<TreeNode> deque = new ArrayDeque();
        deque.add(root);
        boolean flag = true;

        while (deque.size() > 0) {
            List<Integer> temp = new ArrayList<>();
            for (int i = deque.size(); i > 0; i--) {

                TreeNode node = deque.pop();
                temp.add(node.val);
                if (null != node.left) {
                    deque.add(node.left);
                }
                if (null != node.right) {
                    deque.add(node.right);
                }
            }
            if (flag) {
                res.add(temp);
                flag = !flag;
            } else {
                Collections.reverse(temp);
                res.add(temp);
                flag = !flag;
            }
        }
        return res;
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