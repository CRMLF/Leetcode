package com.zl.jianzhi.day15;


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.*;
import java.sql.Driver;

import static com.sun.jmx.snmp.SnmpStatusException.readOnly;


/**
 * @Description
 * @Author ZhengLing
 * @Date 2022/03/15 9:21
 */
public class Day15_1 {


    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        
    }

    private <T> T getObject(Class<T> c) throws InstantiationException, IllegalAccessException {
        return c.newInstance();
    }


    LinkedList<List<Integer>> res = new LinkedList<>();
    LinkedList<Integer> path = new LinkedList<>();

    private List<List<Integer>> pathSum(TreeNode root, int target) {
        recur(root, target);
        return res;
    }

    private void recur(TreeNode root, int target) {
        if (null == root) {
            return;
        }
        path.add(root.val);
        target -= root.val;
        if (target == 0 && null == root.right && null == root.left) {
            res.add(new LinkedList<>(path));
        }
        recur(root.left, target);
        recur(root.right, target);
        path.removeLast();
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
}


