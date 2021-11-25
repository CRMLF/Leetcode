package com.zl.array.array0051;

import com.sun.org.apache.xerces.internal.xs.StringList;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author ZhengLing
 * @Date 2021/11/25 0:35
 */
public class Array0051 {
    public static void main(String[] args) {
        System.out.println(new Solution().solveNQueens(9));
    }
}

class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<Integer>> numLists = new ArrayList<>();
        List<List<String>> res = new ArrayList<>();
        boolean flag = true;
        for (List<Integer> list : all(n)) {
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (i - j == list.get(i) - list.get(j) || j - i == list.get(i) - list.get(j)) {
                        flag = false;
                        break;
                    }
                }
            }
            if (flag) {
                numLists.add(list);
            }
            flag = true;
        }
        for (List<Integer> numList : numLists) {
            List<String> temp = new ArrayList<>();
            for (int i = 0; i < numList.size(); i++) {
                int location = numList.get(i);
                StringBuilder str = new StringBuilder();
                for (int j = 0; j < numList.size(); j++) {
                    if (j == location) {
                        str.append("Q");
                    } else {
                        str.append(".");
                    }
                }
                temp.add(str.toString());
            }
            res.add(temp);
        }
        return res;
    }

    public List<List<Integer>> all(int n) {
        List<List<Integer>> res = new ArrayList<>();
        boolean[] used = new boolean[n];
        List<Integer> path = new ArrayList<>();

        dfs(used, 0, path, res);

        return res;
    }

    public void dfs(boolean[] used, int usedLen, List<Integer> path, List<List<Integer>> res) {
        if (usedLen == used.length) {
            res.add(new ArrayList<>(path));
            return;
        }
        
        for (int i = 0; i < used.length; i++) {
            if (!used[i]) {
                path.add(i);
                used[i] = true;
                dfs(used, usedLen + 1, path, res);
                used[i] = false;
                path.remove(path.size() - 1);
            }
        }
    }
}
