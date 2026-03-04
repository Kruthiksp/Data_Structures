package com.kruthik.binaryTree;

public class LevelsOfBinaryTree {
    public static int levels(Node root) {
        if (root == null) return 0;

        int leftLevel = levels(root.left);
        int rightLevel = levels(root.right);

        return 1 + Math.max(leftLevel, rightLevel);
    }
}
