package com.kruthik.binarySearchTree;

import java.util.ArrayList;

// Replace every node with the sum of all the elements greater than that Node
public class BST_To_GST_GFG {

    public static void transformTree(Node root) {
        ArrayList<Node> inOrder = new ArrayList<>();
        inOrder(root, inOrder);

        int sum = 0;
        for (int i = inOrder.size() - 1; i >= 0; i--) {
            int val = inOrder.get(i).data;
            inOrder.get(i).data = sum;
            sum += val;
        }
    }

    private static void inOrder(Node root, ArrayList<Node> inOrder) {
        if (root == null) return;
        inOrder(root.left, inOrder);
        inOrder.add(root);
        inOrder(root.right, inOrder);
    }

}
