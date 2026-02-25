package com.kruthik.binarTree;

public class MinimumValueInBinaryTree {

    public static int minValue(Node root) {
        if (root == null) return Integer.MAX_VALUE;

        int leftMin = minValue(root.left);
        int rightMin = minValue(root.right);

        return Math.min(root.data, Math.min(leftMin, rightMin));
    }
}
