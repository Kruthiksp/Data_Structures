package com.kruthik.binarySearchTree;

import java.util.ArrayList;

public class Kth_Smallest_In_BST_GFG {
    public int kthSmallest(Node root, int k) {
        ArrayList<Integer> arr = new ArrayList<>();
        inOrder(root, arr);
        if (k > arr.size()) return -1;
        else return arr.get(k - 1);
    }
    private void inOrder(Node root, ArrayList<Integer> arr) {
        if (root == null) return;
        inOrder(root.left, arr);
        arr.add(root.data);
        inOrder(root.right, arr);
    }

}
