package com.kruthik.queue;

import java.util.LinkedList;
import java.util.Queue;

public class AddAtIndex {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= 5; i++) q.add(i * 10);

        int idx = 3;
        int ele = 100;

        int n = q.size();
        for (int i = 0; i < n; i++) {
            if (i == idx) q.add(ele);
            q.add(q.remove());
        }
        System.out.println(q);
    }
}
