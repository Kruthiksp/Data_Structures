package com.kruthik.heap;

import java.util.Comparator;
import java.util.PriorityQueue;

class Pair {
    int val;
    int dist;

    Pair(int val, int dist) {
        this.val = val;
        this.dist = dist;
    }
}

public class KClosestElements_GFG {

    // Inner Class
    static class MyComparator implements Comparator<Pair> {
        public int compare(Pair p1, Pair p2) {
            Integer d1 = p1.dist;
            Integer d2 = p2.dist;

            if (p1.dist != p2.dist)
                return -d1.compareTo(d2);

            return p1.val - p2.val;
        }
    }

    int[] printKClosest(int[] arr, int k, int x) {
        PriorityQueue<Pair> pq = new PriorityQueue<>(new MyComparator());
        int[] res = new int[k];

        for (int num : arr) {
            if (num == x) continue;

            int dist = Math.abs(x - num);
            pq.add(new Pair(num, dist));
            if (pq.size() > k) pq.remove();

        }
        int idx = k - 1;
        while (!pq.isEmpty()) {
            res[idx--] = pq.remove().val;
        }

        return res;
    }
}


