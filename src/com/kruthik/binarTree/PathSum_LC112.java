package com.kruthik.binarTree;

public class PathSum_LC112 {
    public boolean hasPathSum(Node root, int targetSum) {
        if (root == null) return false;
        if (root.left == null && root.right == null) {
            if (targetSum == root.data) return true;
            else return false;
        }
        return hasPathSum(root.left, targetSum - root.data) ||
                hasPathSum(root.right, targetSum - root.data);
    }
}
