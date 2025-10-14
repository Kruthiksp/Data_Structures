package com.kruthik.recursion;

public class TowerOfHanoi {
    public static void main(String[] args) {
        hanoi(5, 'A', 'C', 'B');

    }

    public static void hanoi(int n, char from, char to, char auxiliary) {
        if (n == 0) return;
        hanoi(n - 1, from, auxiliary, to);
        System.out.println(from + " -> " + to);
        hanoi(n - 1, auxiliary, to, from);
    }

}
