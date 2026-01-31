package com.kruthik.queue;

import java.util.LinkedList;
import java.util.Queue;

public class TraversalInQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= 5; i++) q.add(i * 10);

        int n = q.size();
        for (int i = 0; i < n; i++) {
            System.out.print(q.peek() + " ");
            q.add(q.remove());
        }
    }
}
