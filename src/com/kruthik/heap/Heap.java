package com.kruthik.heap;

import java.util.PriorityQueue;

public class Heap {
    public static void main(String[] args) {
        int[] arr = {23, 5, 78, 11, 90, 34, 67, 2, 49, 16};

//        PriorityQueue<Integer> min = Create_MinHeap.createMinHeap(arr);
//        PriorityQueue<Integer> max = Create_MaxHeap.createMaxHeap(arr);
//
//        System.out.println(min);
//        System.out.println(max);

//        Min Heap Implementation
        MinHeap_Impl heap = new MinHeap_Impl(10);
        heap.remove();
        heap.add(23); heap.add(5);
        heap.add(78); heap.add(11); heap.add(90);
        heap.display();
        heap.remove(); heap.display();

        heap.add(34); heap.add(67); heap.add(2);
        heap.display();

        heap.remove(); heap.display();

        heap.add(49); heap.add(16);
        System.out.println("Peak: " + heap.peek());
        heap.add(100);
        heap.add(200);
        heap.add(300);
    }
}
