package com.kruthik.heap;

import java.util.PriorityQueue;

public class Nearlysorted_GFG {
    public static void nearlySorted(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        int idx = 0;
        for (int num : arr) {
            pq.add(num);
            if (pq.size() > k) arr[idx++] = pq.remove();
        }

        // This loop runs when all the elements have been traversed
        while (!pq.isEmpty()) arr[idx++] = pq.remove();
    }
}
