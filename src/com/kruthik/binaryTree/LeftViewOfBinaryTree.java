package com.kruthik.binaryTree;

import java.util.ArrayList;

// Same way we can do Right View Tree as Well
// By Just changing the order in view()
public class LeftViewOfBinaryTree {
    public ArrayList<Integer> leftView(Node root) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        view(root, 0, ans);
        return ans;
    }

    private void view(Node root, int level, ArrayList<Integer> ans) {
        if (root == null) return;

        if (level >= ans.size()) ans.add(root.data);
        else ans.set(level, root.data);

        view(root.right, level + 1, ans);
        view(root.left, level + 1, ans);
    }
}
