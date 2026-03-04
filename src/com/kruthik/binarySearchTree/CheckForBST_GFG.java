package com.kruthik.binarySearchTree;

import java.util.ArrayList;

public class CheckForBST_GFG {

    public boolean isBST(Node root) {
        ArrayList<Integer> arr = new ArrayList<>();
        inOrder(root, arr);
        return isSorted(arr);
    }

    private boolean isSorted(ArrayList<Integer> arr) {
        for (int i = 0; i < arr.size() - 1; i++) {
            if (arr.get(i) > arr.get(i + 1))
                return false;
        }
        return true;
    }

    private void inOrder(Node root, ArrayList<Integer> arr) {
        if (root == null) return;
        inOrder(root.left, arr);
        arr.add(root.data);
        inOrder(root.right, arr);
    }

}
