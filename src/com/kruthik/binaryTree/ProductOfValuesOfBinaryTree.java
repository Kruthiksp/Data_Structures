package com.kruthik.binaryTree;

public class ProductOfValuesOfBinaryTree {
    public static int product(Node root) {
        return (root == null) ? 1 : root.data * product(root.left) * product(root.right);
    }
}
