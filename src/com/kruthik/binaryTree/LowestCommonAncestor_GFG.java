package com.kruthik.binaryTree;

public class LowestCommonAncestor_GFG {
    Node lca(Node root, int n1, int n2) {
        if (n1 == root.data || n2 == root.data) return root;
        boolean n1LiesInLeft = exists(root.left, n1);
        boolean n2LiesInLeft = exists(root.left, n2);

        if (n1LiesInLeft && n2LiesInLeft)
            return lca(root.left, n1, n2);
        else if (!n1LiesInLeft && !n2LiesInLeft)
            return lca(root.right, n1, n2);
        else
            return root;
    }

    boolean exists(Node root, int val) {
        if (root == null) return false;
        if (root.data == val) return true;

        return exists(root.left, val) || exists(root.right, val);
    }
}
