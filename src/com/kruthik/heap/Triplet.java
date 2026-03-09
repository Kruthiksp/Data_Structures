package com.kruthik.heap;

public class Triplet {
    int x;
    int y;
    double dist;

    public Triplet(int x, int y, double dist) {
        this.x = x;
        this.y = y;
        this.dist = dist;
    }

    @Override
    public String toString() {
        return "Triplet{" +
                "x=" + x +
                ", y=" + y +
                ", dist=" + dist +
                '}';
    }
}
