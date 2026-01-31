package com.kruthik.queue;

import java.util.LinkedList;
import java.util.Queue;

public class PeekAtIndex {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= 6; i++) q.add(i * 10);

        System.out.println("Original Queue: " + q);
        int idx = 3;
        int n = q.size();
        for (int i = 0; i < n; i++) {
            int num = q.remove();
            if (i == idx) System.out.println("Element at index " + idx + " is: " + num);
            q.add(num);
        }
    }
}
