package com.kruthik.binaryTree;

import java.util.ArrayList;

public class FlattenBinaryTree_GFG {

    public static void flatten(Node root) {
        ArrayList<Node> arr = new ArrayList<>();
        preOrder(root, arr);

        for (int i = 0; i < arr.size() - 1; i++) {
            Node a = arr.get(i);
            Node b = arr.get(i + 1);
            a.right = b;
            a.left = null;
        }
    }

    private static void preOrder(Node root, ArrayList<Node> arr) {
        if (root == null) return;

        arr.add(root);
        preOrder(root.left, arr);
        preOrder(root.right, arr);
    }

}
