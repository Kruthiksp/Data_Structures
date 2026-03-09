package com.kruthik.heap;

import java.util.Collections;
import java.util.PriorityQueue;

class MedianFinder {
    private PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    private PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

    public MedianFinder() {
    }

    public void addNum(int num) {
        if (maxHeap.isEmpty()) maxHeap.add(num);
        else {
            if (num < maxHeap.peek()) maxHeap.add(num);
            else minHeap.add(num);
        }
        if (maxHeap.size() == minHeap.size() + 2) minHeap.add(maxHeap.remove());
        else if (minHeap.size() == maxHeap.size() + 2) maxHeap.add(minHeap.remove());
    }

    public double findMedian() {
        if (maxHeap.size() > minHeap.size()) return maxHeap.peek();
        else if (minHeap.size() > maxHeap.size()) return minHeap.peek();
        else return (maxHeap.peek() + minHeap.peek()) / 2.0;
    }
}

public class MedianOfADataStream {

}
