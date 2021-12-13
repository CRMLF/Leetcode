package com.zl.array.array0106;

import java.util.HashMap;

/**
 * @Description
 * @Author ZhengLing
 * @Date 2021/12/13 10:39
 */
public class Array0106 {
    public static void main(String[] args) {
        System.out.println(new Solution().buildTree(new int[]{9, 3, 15, 20, 7}, new int[]{9, 15, 7, 20, 3}));
    }
}

class Solution {
    int postIdx;
    int[] postOrder;
    int[] inorder;
    HashMap<Integer, Integer> idxMap = new HashMap<Integer, Integer>();

    public TreeNode helper(int inLeft, int inRight) {
        // 如果这里没有节点构造二叉树了，就结束
        if (inLeft > inRight) {
            return null;
        }

        // 选择 post_idx 位置的元素作为当前子树根节点
        int rootVal = postOrder[postIdx];
        TreeNode root = new TreeNode(rootVal);

        // 根据 root 所在位置分成左右两棵子树
        int index = idxMap.get(rootVal);

        // 下标减一
        postIdx--;
        // 构造右子树
        root.right = helper(index + 1, inRight);
        // 构造左子树
        root.left = helper(inLeft, index - 1);
        return root;
    }

    public TreeNode buildTree(int[] inOrder, int[] postOrder) {
        this.postOrder = postOrder;
        this.inorder = inOrder;
        // 从后序遍历的最后一个元素开始
        postIdx = postOrder.length - 1;

        // 建立（元素，下标）键值对的哈希表
        int idx = 0;
        for (Integer val : inOrder) {
            idxMap.put(val, idx++);
        }

        return helper(0, inOrder.length - 1);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
