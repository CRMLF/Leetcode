package com.zl.jianzhi.day07;

/**
 * @Description
 * @Author ZhengLing
 * @Date 2022/03/04 19:56
 */
public class Day07_2 {
    public static void main(String[] args) {
        String a = "22";
        String b = "22";
        System.out.println(System.identityHashCode(a));
        System.out.println(System.identityHashCode(b));
    }
}

class Solution1 {
    public TreeNode mirrorTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode leftRoot = mirrorTree(root.right);
        TreeNode rightRoot = mirrorTree(root.left);
        root.left = leftRoot;
        root.right = rightRoot;
        return root;
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
