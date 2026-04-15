package com.kruthik.binaryTree;

public class CountNumberOfNodesInCompleteBinaryTree {
    public static int countNodes(Node root) {
        if (root == null) return 0;

        int lHeight = getLeftHeight(root);
        int rHeight = getRightHeight(root);

        if (lHeight == rHeight)
            return (1 << lHeight) - 1;

        return 1 + countNodes(root.left) + countNodes(root.right);
    }

    private static int getLeftHeight(Node node) {
        int height = 0;

        while (node != null) {
            height++;
            node = node.left;
        }

        return height;
    }

    private static int getRightHeight(Node node) {
        int height = 0;

        while (node != null) {
            height++;
            node = node.right;
        }

        return height;
    }
}
