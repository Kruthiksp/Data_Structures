package com.kruthik.binarTree;

import java.util.LinkedList;
import java.util.Queue;

// Level Order traversal also called as Breadth First Search
// Prints the values level wise
public class LevelOrderTraversal_BFS {

    public static void levelOrderTraversal(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            Node node = q.remove();
            System.out.print(node.data + " ");
            if (node.left != null) q.add(node.left);
            if (node.right != null) q.add(node.right);
        }
        System.out.println();
    }

    public static void levelOrder_LineByLine(Node root) {
        Queue<Pair> q = new LinkedList<>();
        int currentLevel = 0;

        q.add(new Pair(root, currentLevel));
        while (!q.isEmpty()) {
            Pair pair = q.remove();
            Node node = pair.node;
            int level = pair.level;

            if (level != currentLevel) {
                currentLevel++;
                System.out.println();
            }
            System.out.print(node.data + " ");
            if (node.left != null) q.add(new Pair(node.left, level + 1));
            if (node.right != null) q.add(new Pair(node.right, level + 1));
        }
        System.out.println();
    }

    public static void displayKthLevel(Node root, int k) {
        Queue<Pair> q = new LinkedList<>();

        // 0 based Leveling
        q.add(new Pair(root, 0));
        while (!q.isEmpty()) {
            Pair pair = q.remove();
            Node node = pair.node;
            int level = pair.level;

            if (level == k) System.out.print(node.data + " ");

            if (node.left != null) q.add(new Pair(node.left, level + 1));
            if (node.right != null) q.add(new Pair(node.right, level + 1));
        }
        System.out.println();
    }

    public static void displayKthLevel_recursion(Node root, int currentLevel, int k) {
        if(root == null) return;
        if (currentLevel == k) System.out.print(root.data + " ");

        displayKthLevel_recursion(root.left, currentLevel + 1, k);
        displayKthLevel_recursion(root.right, currentLevel + 1, k);
    }
}

class Pair {
    Node node;
    int level;

    public Pair(Node node, int level) {
        this.node = node;
        this.level = level;
    }
}
