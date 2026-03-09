package com.kruthik.heap;

import java.util.PriorityQueue;

public class MinimumCostOfRopes_GFG {
    public static int minCost(int[] arr) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int num : arr) pq.add(num);

        int sum = 0;
        while (pq.size() > 1) {
            int r1 = pq.remove();
            int r2 = pq.remove();

            int cost = r1 + r2;
            sum += cost;

            pq.add(cost);
        }
        return sum;
    }
}
