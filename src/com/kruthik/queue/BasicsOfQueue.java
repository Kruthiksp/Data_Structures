package com.kruthik.queue;

import java.util.LinkedList;
import java.util.Queue;

public class BasicsOfQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= 5; i++) q.add(i * 10);

        // Add
        System.out.println("Queue after adding elements:" + q);
        // Remove
        System.out.println("Remove after removing a element: " + q.remove());
        // Peek
        System.out.println("Top element of the Queue: " + q.peek());
        // Size
        System.out.println("Size after removing: " + q.size());
        // isEmpty
        System.out.println("Is Queue Empty: " + q.isEmpty());
    }
}
