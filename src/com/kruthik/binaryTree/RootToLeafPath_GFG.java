package com.kruthik.binaryTree;

import java.util.ArrayList;

public class RootToLeafPath_GFG {

    public static void main(String[] args) {
        Node root = CreateBinaryTree.createBinaryTree();
        ArrayList<ArrayList<Integer>> res = Paths(root);
        System.out.println(res);
    }

    public static ArrayList<ArrayList<Integer>> Paths(Node root) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList<>();

        helper(root, arr, ans);

        return ans;
    }

    public static void helper(Node root, ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ans) {
        if (root == null) return;

        arr.add(root.data);
        if (root.left == null && root.right == null) {
            ArrayList<Integer> path = new ArrayList<>(arr);
            ans.add(path);
        }

        helper(root.left, arr, ans);
        helper(root.right, arr, ans);
        arr.remove(arr.size() - 1); // BackTracking
    }
}
