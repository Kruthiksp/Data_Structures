package com.kruthik.binaryTree;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class BurningTree_GFG {
    static class Pair {
        Node node;
        int time;

        public Pair(Node node, int time) {
            this.node = node;
            this.time = time;
        }
    }

    static Node start;
    static HashMap<Node, Node> parents;

    public static int minTime(Node root, int target) {
        // Initialize Static Variables
        start = null;
        parents = new HashMap<>();

        // Add All child and Parent Pair into the map
        dfs(root, target);

        // Similar to BFS
        Queue<Pair> q = new LinkedList<>();
        // Start BFS from Start
        q.add(new Pair(start, 0));

        // Add the start Node as Burnt
        HashSet<Node> burnt = new HashSet<>();
        burnt.add(start);
        // Max Time taken to burn last Node
        int maxTime = 0;

        // BFS Starting from start Node
        while (!q.isEmpty()) {
            Pair front = q.remove();
            Node node = front.node;
            int time = front.time;

            maxTime = Math.max(maxTime, time);

            // Adding Left to Queue
            if (node.left != null && !burnt.contains(node.left)) {
                q.add(new Pair(node.left, time + 1));
                burnt.add(node.left); // mark as burnt
            }
            // Adding Right to Queue
            if (node.right != null && !burnt.contains(node.right)) {
                q.add(new Pair(node.right, time + 1));
                burnt.add(node.right); // mark as burnt
            }
            // Adding Parent to Queue
            if (parents.containsKey(node) && !burnt.contains(parents.get(node))) {
                q.add(new Pair(parents.get(node), time + 1));
                burnt.add(parents.get(node)); // mark as burnt
            }
        }
        return maxTime;
    }

    // To add All parents and child into the map
    public static void dfs(Node root, int target) {
        if (root == null) return;
        if (root.data == target) start = root;

        if (root.left != null) parents.put(root.left, root);
        if (root.right != null) parents.put(root.right, root);

        dfs(root.left, target);
        dfs(root.right, target);
    }
}
