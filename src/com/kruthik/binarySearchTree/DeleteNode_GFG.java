package com.kruthik.binarySearchTree;

public class DeleteNode_GFG {

    public Node delNode(Node root, int x) {
        if (root == null) return null;
        if (root.data > x) root.left = delNode(root.left, x);
        else if (root.data < x) root.right = delNode(root.right, x);
        else {
            // Case-1: leaf Node
            if (root.left == null && root.right == null) return null;

            // Case-2: 1 Child Node
            if (root.left == null) return root.right;
            else if (root.right == null) return root.left;

            // Case-3: 2 Child Nodes
            Node predecessor = root.left;
            while (predecessor.right != null) predecessor = predecessor.right;

            // Delete Predecessor Node
            // As it is already stored in predecessor variable it is safe
            // This case is handled in *leaf node* or *1 Child Node* case for sure
            root.left = delNode(root.left, predecessor.data);
            predecessor.left = root.left;
            predecessor.right = root.right;

            return predecessor;
        }
        return root;
    }
}

