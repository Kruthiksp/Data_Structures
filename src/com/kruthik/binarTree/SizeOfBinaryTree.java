package com.kruthik.binarTree;

public class SizeOfBinaryTree {
    public static int size(Node root) {
        return (root == null) ? 0 : 1 + size(root.left) + size(root.right);
    }
}
