package com.kruthik.heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallest_GFG {

    public int kthSmallest(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int num : arr) {
            pq.add(num);
            if (pq.size() > k) pq.remove();
        }
        return pq.peek();
    }
}
