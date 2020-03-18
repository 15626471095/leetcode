package com.leetcode;

import java.util.HashSet;
import java.util.Set;

public class Leetcode_5080 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    // leetcode 5080 查找两棵二叉搜索树之和

    public boolean twoSumBSTs(TreeNode root1, TreeNode root2, int target) {
        Set<Integer> set1 = new HashSet<>();
        readNode(root1, set1);
        Set<Integer> set2 = new HashSet<>();
        readNode(root2, set2);
        for (int i : set1) {
            if (set2.contains(target - i)) {
                return true;
            }
        }
        return false;
    }

    public void readNode(TreeNode node, Set<Integer> set) {
        set.add(node.val);
        if (node.left != null) {
            readNode(node.left, set);
        }
        if (node.right != null) {
            readNode(node.right, set);
        }
    }

}
