package com.zl.jianzhi.day07;

/**
 * @Description
 * @Author ZhengLing
 * @Date 2022/03/05 15:53
 */
public class Day07_3 {
}

class Solution2 {
    public boolean isSymmetric(Solution1.TreeNode root) {
        return root == null || recur(root.left, root.right);
    }

    private boolean recur(Solution1.TreeNode left, Solution1.TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null || left.val != right.val) {
            return false;
        }
        return recur(left.left, right.right) && recur(left.right, right.left);


    }


}