package com.kruthik.binarTree;

public class SumOfValuesOfBinaryTree {
    static int sum = 0;

    public static int sum(Node root) {
        return (root == null) ? 0 : root.data + sum(root.left) + sum(root.right);
    }
}
