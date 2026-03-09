package com.kruthik.heap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class K_LargestElements {
    public static ArrayList<Integer> kLargest(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        ArrayList<Integer> res = new ArrayList<>();

        for (int num : arr) {
            pq.add(num);
            if (pq.size() > k) pq.remove();
        }

        while (!pq.isEmpty()) {
            res.add(pq.remove());
        }

        Collections.reverse(res);
        return res;
    }
}
