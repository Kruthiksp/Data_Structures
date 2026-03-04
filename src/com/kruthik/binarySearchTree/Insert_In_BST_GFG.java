package com.kruthik.binarySearchTree;

public class Insert_In_BST_GFG {
    public Node insert(Node root, int key) {
        attach(root, key);
        return root;
    }

    private void attach(Node root, int key) {
        if (root == null) return;
        if (root.data == key) return;

        if (root.data < key) {
            if (root.right == null) root.right = new Node(key);
            else attach(root.right, key);
        } else {
            if (root.left == null) root.left = new Node(key);
            else attach(root.left, key);
        }
    }

}
