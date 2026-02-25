package com.kruthik.binarTree;

import java.util.ArrayList;
import java.util.Stack;

public class TreeTraversal_Using_Iterative {

    public static void preOrderIterative(Node root) {
        Stack<Node> stk = new Stack<>();
        stk.push(root);

        while (!stk.isEmpty()) {
            Node node = stk.pop();
            System.out.print(node.data + " ");
            if (node.right != null) stk.push(node.right);
            if (node.left != null) stk.push(node.left);
        }
        System.out.println();
    }

    public static void reverse_PreOrderIterative(Node root) {
        Stack<Node> stk = new Stack<>();
        stk.push(root);

        while (!stk.isEmpty()) {
            Node node = stk.pop();
            System.out.print(node.data + " ");
            if (node.left != null) stk.push(node.left);
            if (node.right != null) stk.push(node.right);
        }
        System.out.println();
    }

    public static void postOrderIterative(Node root) {
        Stack<Node> stk = new Stack<>();
        ArrayList<Integer> arr = new ArrayList<>();
        stk.push(root);

        while (!stk.isEmpty()) {
            Node node = stk.pop();
            arr.add(node.data);
            if (node.left != null) stk.push(node.left);
            if (node.right != null) stk.push(node.right);
        }
        for (int i = arr.size() - 1; i >= 0; i--) System.out.print(arr.get(i) + " ");
        System.out.println();
    }

    public static void inOrder_Iterative(Node root) {
        Stack<Node> stk = new Stack<>();
        Node current = root;

        while (current != null || !stk.isEmpty()) {
            if (current == null) {
                Node node = stk.pop();
                System.out.print(node.data + " ");
                current = node.right;
            }
            if (current.left != null) {
                stk.push(current);
                current = current.left;
                continue;
            }
            System.out.print(current.data + " ");
            current = current.right;
        }
        System.out.println();
    }
}
