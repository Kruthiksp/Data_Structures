package com.kruthik.binarySearchTree;

public class TreeInfo {
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20, 25, 30, 35, 40};
        Node root = SortedArrayToBalancedBST_GFG.sortedArrayToBST(arr);
        Info treeInfo = getTreeInfo(root);
        System.out.println(treeInfo);
    }

    public static Info getTreeInfo(Node root) {
        if (root == null) return new Info(Integer.MAX_VALUE, Integer.MIN_VALUE, 0, 0, true);

        Info left = getTreeInfo(root.left);
        Info right = getTreeInfo(root.right);

        int min = Math.min(root.data, Math.min(left.min, right.min));
        int max = Math.max(root.data, Math.max(left.max, right.max));
        int size = 1 + left.size + right.size;
        int sum = root.data + left.sum + right.sum;
        boolean isBST = left.isBST &&
                        right.isBST &&
                        root.data > left.max &&
                        root.data < right.min;


        return new Info(min, max, size, sum, isBST);
    }
}
