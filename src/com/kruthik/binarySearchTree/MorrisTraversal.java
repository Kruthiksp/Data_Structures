package com.kruthik.binarySearchTree;

public class MorrisTraversal {
    public static void main(String[] args) {
        int[] arr = {1, 5, 9, 14, 23, 27};
        Node root = SortedArrayToBalancedBST_GFG.sortedArrayToBST(arr);
        inOrder(root);
    }

    public static void inOrder(Node root) {
        Node current = root;
        while (current != null) {
            if (current.left != null) {
                // Finding Predecessor
                Node predecessor = current.left;
                while (predecessor.right != null && predecessor.right != current) {
                    predecessor = predecessor.right;
                }
                if (predecessor.right == null) {
                    predecessor.right = current;
                    current = current.left;
                } else {        // Predecessor.right == current -> so print and restore
                    predecessor.right = null;
                    System.out.print(current.data + " ");
                    current = current.right;
                }
            } else {
                System.out.print(current.data + " ");
                current = current.right;
            }
        }
        System.out.println();
    }
}
