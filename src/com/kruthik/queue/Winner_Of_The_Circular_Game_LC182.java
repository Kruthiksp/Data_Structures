package com.kruthik.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Winner_Of_The_Circular_Game_LC182 {
    public static void main(String[] args) {
        int winner = findTheWinner(3, 1);
        System.out.println("Winner: " + winner);
    }

    public static int findTheWinner(int n, int k) {
        Queue<Integer> q = new LinkedList<>();

        for (int i = 1; i <= n; i++) q.add(i);

        int count = 1;
        while (q.size() > 1) {
            if (count == k) {
                q.remove();
                count = 1;
                continue;
            }
            q.add(q.remove());
            count++;
        }
        return q.peek();
    }
}
