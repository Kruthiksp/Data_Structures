package com.kruthik.binarTree;

public class MaximumValueInBinaryTree {

    public static int maxValue(Node root) {
        if (root == null) return Integer.MIN_VALUE;

        int leftMax = maxValue(root.left);
        int rightMax = maxValue(root.right);

        return Math.max(root.data, Math.max(leftMax, rightMax));
    }
}
