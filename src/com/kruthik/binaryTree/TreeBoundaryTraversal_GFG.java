package com.kruthik.binaryTree;

import java.util.ArrayList;

public class TreeBoundaryTraversal_GFG {

    ArrayList<Integer> boundaryTraversal(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(root.data);

        if (root.left == null && root.right == null) return ans;

        if (root.left != null) leftBoundary(root.left, ans);
        leafBoundary(root, ans);
        if (root.right != null) rightBoundary(root.right, ans);

        return ans;
    }

    private void leftBoundary(Node root, ArrayList<Integer> ans) {
        if (root == null) return;
        if (root.left == null && root.right == null) return;

        ans.add(root.data);

        if (root.left != null) leftBoundary(root.left, ans);
        else leftBoundary(root.right, ans);
    }

    private void leafBoundary(Node root, ArrayList<Integer> ans) {
        if (root == null) return;
        if (root.left == null && root.right == null) ans.add(root.data);

        leafBoundary(root.left, ans);
        leafBoundary(root.right, ans);
    }

    private void rightBoundary(Node root, ArrayList<Integer> ans) {
        if (root.left == null && root.right == null) return;

        if (root.right != null) rightBoundary(root.right, ans);
        else rightBoundary(root.left, ans);

        // adding after call
        // because we want right boundary in reverse order
        ans.add(root.data);
    }

}
