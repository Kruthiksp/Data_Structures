package com.kruthik.binaryTree;

public class Construct_Tree_from_Inorder_and_Postorder_GFG {
    Node buildTree(int[] inorder, int[] postorder) {
        int n = inorder.length;
        return build(0, n - 1, 0, n - 1, postorder, inorder);
    }

    public static Node build(int pLow, int pHigh, int iLow, int iHigh, int[] post, int[] in) {
        if (pLow > pHigh) return null;

        int data = post[pHigh];
        Node root = new Node(data);

        int rIdx = -1;
        for (int i = iLow; i <= iHigh; i++) {
            if (in[i] == data) {
                rIdx = i;
                break;
            }
        }
        int leftSize = rIdx - iLow;
        root.left = build(pLow, (pLow + leftSize - 1), iLow, rIdx - 1, post, in);
        root.right = build((pLow + leftSize), (pHigh - 1), rIdx + 1, iHigh, post, in);

        return root;
    }
}
