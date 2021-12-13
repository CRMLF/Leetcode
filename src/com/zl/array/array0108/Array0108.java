package com.zl.array.array0108;

/**
 * @Description
 * @Author ZhengLing
 * @Date 2021/12/13 13:48
 */
public class Array0108 {
    public static void main(String[] args) {
        System.out.println();
    }
}

class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return myBuildTree(nums, 0, nums.length - 1);
    }

    private TreeNode myBuildTree(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }
        int mid = (left + right) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = myBuildTree(nums, left, mid - 1);
        root.right = myBuildTree(nums, mid + 1, right);

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

