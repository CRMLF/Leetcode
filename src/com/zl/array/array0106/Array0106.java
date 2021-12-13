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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return myBuildTree(map, 0, inorder.length - 1, postorder, 0, postorder.length - 1);
    }

    private TreeNode myBuildTree(HashMap<Integer, Integer> map, int inLeft, int inRight, int[] postOrder, int postLeft, int postRight) {
        if (inLeft > inRight || postLeft > postRight) {
            return null;
        }

        int rootVal = postOrder[postRight];
        int iIndex = map.get(rootVal);
        TreeNode root = new TreeNode(rootVal);
        root.left = myBuildTree(map, inLeft, iIndex - 1, postOrder, postLeft, iIndex - inLeft + postLeft - 1);
        root.right = myBuildTree(map, iIndex + 1, inRight, postOrder, iIndex - inLeft + postLeft, postRight - 1);
        return root;
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
