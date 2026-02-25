package com.kruthik.binarTree;

public class MinimumDistanceBetween2Nodes_GFG_Hard {

    int findDist(Node root, int a, int b) {
        Node lca = lca(root, a, b);
        int[] dist = {0,0};
        distance(lca, a, b, 0, dist);
        return dist[0] + dist[1];
    }

    Node lca(Node root, int a, int b) {
        if(root.data == a || root.data == b) return root;

        boolean aExistsInLeft = exists(root.left, a);
        boolean bExistsInRight = exists(root.right, b);

        if((aExistsInLeft && bExistsInRight) || (!aExistsInLeft && !bExistsInRight))
            return root;
        else if(aExistsInLeft && !bExistsInRight)
            return lca(root.left, a, b);
        else
            return lca(root.right, a, b);
    }

    boolean exists(Node root, int val) {
        if(root == null) return false;
        if(root.data == val) return true;

        return exists(root.left, val) || exists(root.right, val);
    }

    void distance(Node root, int a, int b, int level, int[] dist) {
        if(root == null) return;
        if(root.data == a) dist[0] = level;
        if(root.data == b) dist[1] = level;
        distance(root.left, a, b, level+1, dist);
        distance(root.right, a, b, level+1, dist);
    }

}
