package com.kruthik.heap;

import java.util.PriorityQueue;

public class Create_MinHeap {
    public static PriorityQueue<Integer> createMinHeap(int[] arr) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int num : arr) pq.add(num);
        return pq;
    }
}
