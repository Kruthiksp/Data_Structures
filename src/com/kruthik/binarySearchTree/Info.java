package com.kruthik.binarySearchTree;

public class Info {
    int min;
    int max;
    int size;
    int sum;
    boolean isBST;

    public Info(int min, int max, int size, int sum, boolean isBST) {
        this.min = min;
        this.max = max;
        this.size = size;
        this.sum = sum;
        this.isBST = isBST;
    }

    @Override
    public String toString() {
        return "Info{" +
                "min=" + min +
                ", max=" + max +
                ", size=" + size +
                ", sum=" + sum +
                ", isBST=" + isBST +
                '}';
    }
}
