package com.kruthik.binarySearchTree;

class Quad {
    int min;
    int max;
    int size;
    boolean isBST;

    Quad(int min, int max, int size, boolean isBST) {
        this.min = min;
        this.max = max;
        this.size = size;
        this.isBST = isBST;
    }
}

public class Largest_BST_GFG {

    static int maxSize;

    static int largestBst(Node root) {
        maxSize = 0;
        helper(root);
        return maxSize;
    }

    static Quad helper(Node root) {
        if (root == null)
            return new Quad(Integer.MAX_VALUE, Integer.MIN_VALUE, 0, true);

        Quad left = helper(root.left);
        Quad right = helper(root.right);

        int min = Math.min(root.data, Math.min(left.min, right.min));
        int max = Math.max(root.data, Math.max(left.max, right.max));
        int size = 1 + left.size + right.size;
        boolean isBST = left.isBST &&
                right.isBST &&
                (root.data > left.max && root.data < right.min);

        if (isBST) maxSize = Math.max(maxSize, size);
        return new Quad(min, max, size, isBST);
    }
}
