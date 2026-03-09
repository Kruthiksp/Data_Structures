package com.kruthik.heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class Create_MaxHeap {
    public static PriorityQueue<Integer> createMaxHeap(int[] arr) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int num : arr) pq.add(num);
        return pq;
    }
}
