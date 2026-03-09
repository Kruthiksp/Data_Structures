package com.kruthik.heap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.PriorityQueue;

public class TopKFrequentInArray_GFG {
    public ArrayList<Integer> topKFreq(int[] arr, int k) {
        ArrayList<Integer> res = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr) map.put(num, map.getOrDefault(num, 0) + 1);

        PriorityQueue<Pair> pq = new PriorityQueue<>();

        for(int key : map.keySet()) {
            int freq = map.get(key);
            pq.add(new Pair(key, freq));

            if(pq.size() > k) pq.remove();
        }
        while(!pq.isEmpty()) {
            Pair p = pq.remove();
            res.add(p.ele);
        }
        Collections.reverse(res);
        return res;
    }

    static class Pair implements Comparable<Pair> {
        int ele;
        int freq;

        public Pair(int ele, int freq) {
            this.ele = ele;
            this.freq = freq;
        }

        @Override
        public int compareTo(Pair p) {
            if (this.freq == p.freq) return this.ele - p.ele;
            return this.freq - p.freq;
        }
    }
}
