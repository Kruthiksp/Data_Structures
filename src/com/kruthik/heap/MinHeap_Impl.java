package com.kruthik.heap;

public class MinHeap_Impl {
    private final int[] arr;
    private int idx = 1;

    public MinHeap_Impl(int capacity) {
        arr = new int[capacity + 1];
    }

    public void add(int ele) {
        if (idx >= arr.length) {
            System.out.println("------ Heap is Full ------");
            return;
        }
        arr[idx] = ele;
        // Re-Arrangement
        int current = idx;
        while (current != 1) {
            int parent = current / 2;

            if (arr[parent] > arr[current]) {
                // Swap
                int temp = arr[parent];
                arr[parent] = arr[current];
                arr[current] = temp;

                current = parent;
            } else break;
        }
        idx++;
    }

    public int remove() {
        if (idx == 1) {
            System.out.println("------ Heap is Empty ------");
            return -1;
        }

        int min = arr[1];
        arr[1] = arr[idx - 1];
        idx--;

        // Re-Arrangement
        int current = 1;
        while (2 * current <= size()) {
            int left = 2 * current;
            int right = 2 * current + 1;

            int smallest = left; // Assumption
            if (right <= size() && arr[right] < arr[left]) smallest = right;

            if (arr[current] <= arr[smallest]) break;

            int temp = arr[current];
            arr[current] = arr[smallest];
            arr[smallest] = temp;

            current = smallest;
        }

        return min;
    }

    public int peek() {
        if (idx == 1) {
            System.out.println("Heap is Empty");
            return -1;
        }
        return arr[1];
    }

    public int size() {
        return idx + 1;
    }

    public void display() {
        for (int i = 1; i < idx; i++) System.out.print(arr[i] + " ");
        System.out.println();
    }
}
