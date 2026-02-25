package com.kruthik.binarTree;

public class ConstructTree_Using_Pre_and_In_Order_GFG {
    public static Node buildTree(int[] inorder, int[] preorder) {
        int n = preorder.length;
        return build(0, n - 1, 0, n - 1, preorder, inorder);
    }

    public static Node build(int pre_low, int pre_high, int in_low, int in_high, int[] preorder, int[] inorder) {

        if (pre_low > pre_high) return null;

        int data = preorder[pre_low];
        Node root = new Node(data);

        int root_idx_in_inorder = -1;
        for (int i = 0; i < inorder.length; i++) {
            if (inorder[i] == data) {
                root_idx_in_inorder = i;
                break;
            }
        }

        int left_subtree_count = root_idx_in_inorder - in_low;
        root.left = build((pre_low + 1), (pre_low + left_subtree_count), in_low, (root_idx_in_inorder - 1), preorder, inorder);
        root.right = build((pre_low + left_subtree_count + 1), (pre_high), (root_idx_in_inorder + 1), in_high, preorder, inorder);

        return root;
    }
}
