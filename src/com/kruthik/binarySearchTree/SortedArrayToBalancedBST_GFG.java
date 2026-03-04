package com.kruthik.binarySearchTree;

public class SortedArrayToBalancedBST_GFG {
    public static Node sortedArrayToBST(int[] arr) {
        int n = arr.length;
        return build(arr, 0, n - 1);
    }

    private static Node build(int[] arr, int low, int high) {
        if (low > high) return null;

        int mid = low + (high - low) / 2;
        int data = arr[mid];
        Node root = new Node(data);

        root.left = build(arr, low, mid - 1);
        root.right = build(arr, mid + 1, high);

        return root;
    }
}
