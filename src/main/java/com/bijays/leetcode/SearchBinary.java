package com.bijays.leetcode;


import com.bijays.leetcode.definition.TreeNode;

public class SearchBinary {

    /**
     *
     * Success
     * Details
     * Runtime: 0 ms, faster than 100.00% of Java online submissions for Search in a Binary Search Tree.
     * Memory Usage: 51.6 MB, less than 38.22% of Java online submissions for Search in a Binary Search Tree.
     */
    public static TreeNode searchBST(TreeNode root, int val) {
        if(root == null) return null;
        if(root.val == val) return root;

        if(val < root.val){
            return searchBST(root.left, val);
        }else{
            return searchBST(root.right, val);
        }
    }
}
