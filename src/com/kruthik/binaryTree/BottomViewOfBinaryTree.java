package com.kruthik.binaryTree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class BottomViewOfBinaryTree {
    static class Pair {
        Node node;
        int dist;

        public Pair(Node node, int dist) {
            this.node = node;
            this.dist = dist;
        }
    }

    public ArrayList<Integer> bottomView(Node root) {
        ArrayList<Integer> res = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        Queue<Pair> q = new LinkedList<>();

        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        q.add(new Pair(root, 0));
        while (!q.isEmpty()) {
            Pair front = q.remove();
            Node node = front.node;
            int dist = front.dist;

            min = Math.min(min, dist);
            max = Math.max(max, dist);

            map.put(dist, node.data);
            if (node.left != null) q.add(new Pair(node.left, dist - 1));
            if (node.right != null) q.add(new Pair(node.right, dist + 1));
        }
        for (int i = min; i <= max; i++) {
            res.add(map.get(i));
        }
        return res;
    }
}
