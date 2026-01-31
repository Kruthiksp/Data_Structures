package com.kruthik.queue;

class MyQueue_Array {
    private final int[] arr;
    private int length;
    private int f, r;

    public MyQueue_Array(int n) {
        arr = new int[n];
    }

    public void add(int x) {
        if (length == arr.length) {
            System.out.println("Failed to add the element: " + x + " Root Cause -> Queue is Full");
            return;
        }
        arr[r++] = x;
        if (r == arr.length) r = 0;
        length++;
    }

    public int remove() {
        if (length == 0) {
            System.out.println("Queue is Empty...");
            return -1;
        }
        int num = arr[f++];
        if (f == arr.length) f = 0;
        length--;
        return num;
    }

    public int peek() {
        if (length == 0) {
            System.out.println("Queue is Empty...");
            return -1;
        }
        return arr[f];
    }

    public void display() {
        if (length == 0) {
            System.out.println("Queue is Empty...");
            return;
        }
        if (f >= r) {
            for (int i = f; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            for (int i = 0; i < r - 1; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        } else {
            for (int i = f; i < r; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    public int size() {
        return length;
    }

    public boolean isEmpty() {
        return length == 0;
    }
}

public class QueueUsingArray {
    public static void main(String[] args) {
        int n = 3;
        MyQueue_Array q = new MyQueue_Array(n);

        // Add
        for (int i = 1; i <= n; i++) q.add(i * 10);
        // Display
        q.display();
        // Add
        q.add(500);
        // Remove
        System.out.println(q.remove());
        // Peek
        System.out.println("Peek: " + q.peek());
        System.out.println(q.remove());
        System.out.println(q.remove());
        q.display();
        System.out.println("Size: " + q.size());
        System.out.println("isEmpty: " + q.isEmpty());

        q.add(500);
        System.out.println("Size: " + q.size());
        System.out.println("isEmpty: " + q.isEmpty());
    }
}
