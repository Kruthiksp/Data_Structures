package com.kruthik.heap;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class KClosestToOrigin_GFG {
    public static void main(String[] args) {
        int[][] points = {{2, 4}, {-1, -1}, {0, 0}/*, {0, 1}*/};
        ArrayList<ArrayList<Integer>> res = kClosest(points, 1);
        System.out.println(res);
    }

    public static ArrayList<ArrayList<Integer>> kClosest(int[][] points, int k) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        PriorityQueue<Triplet> pq = new PriorityQueue<>(new MyComparator());

        for (int[] point : points) {
            int x = point[0];
            int y = point[1];
            double dist = Math.sqrt((x * x) + (y * y));

            Triplet t = new Triplet(x, y, dist);
            pq.add(t);

            if (pq.size() > k) {
                pq.remove();
            }
        }

        while (!pq.isEmpty()) {
            ArrayList<Integer> pt = new ArrayList<>();
            Triplet t = pq.remove();
            pt.add(t.x);
            pt.add(t.y);
            res.add(pt);
        }

        return res;
    }
}

class MyComparator implements Comparator<Triplet> {

    @Override
    public int compare(Triplet t1, Triplet t2) {
        Double d1 = (Double) t1.dist;
        Double d2 = (Double) t2.dist;

        return -(d1.compareTo(d2));
    }
}
