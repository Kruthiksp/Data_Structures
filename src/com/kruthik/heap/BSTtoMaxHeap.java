package com.kruthik.heap;

import java.util.ArrayList;

public class BSTtoMaxHeap {
    private static int idx;

    public static void convertToMaxHeapUtil(Node root) {
        idx = 0;
        ArrayList<Integer> inOrder = new ArrayList<>();
        inOrder(root, inOrder);
        postOrder(root, inOrder);
    }

    private static void postOrder(Node root, ArrayList<Integer> inOrder) {
        if (root == null) return;
        postOrder(root.left, inOrder);
        postOrder(root.right, inOrder);
        root.data = inOrder.get(idx++);
    }

    private static void inOrder(Node root, ArrayList<Integer> inOrder) {
        if (root == null) return;

        inOrder(root.left, inOrder);
        inOrder.add(root.data);
        inOrder(root.right, inOrder);
    }
}
