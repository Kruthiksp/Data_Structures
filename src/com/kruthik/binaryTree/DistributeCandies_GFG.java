package com.kruthik.binaryTree;

public class DistributeCandies_GFG {
    public int distCandy(Node root) {
        int[] moves = new int[1];
        helper(root, moves);
        return moves[0];
    }

    // Using int[] instead of static variable.
    private int helper(Node root, int[] moves) {
        if (root == null) return 0;

        int left = helper(root.left, moves);
        int right = helper(root.right, moves);

        moves[0] += Math.abs(left) + Math.abs(right);

        return (root.data + left + right) - 1;
    }
}
