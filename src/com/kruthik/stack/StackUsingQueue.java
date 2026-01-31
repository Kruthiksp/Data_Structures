package com.kruthik.stack;

import java.util.LinkedList;
import java.util.Queue;

// Add efficient Approach
// We can also do this pop efficient Approach
class MyStack_Queue {
    Queue<Integer> q = new LinkedList<>();
    int length;

    public void push(int x) {
        q.add(x);
        length++;
    }

    public int pop() {
        if (length == 0) {
            System.out.println("Stack is Empty");
            return -1;
        }
        for (int i = 0; i < q.size() - 1; i++) q.add(q.remove());

        length--;
        return q.remove();
    }

    public int peek() {
        if (length == 0) {
            System.out.println("Stack is Empty");
            return -1;
        }
        for (int i = 0; i < q.size() - 1; i++) q.add(q.remove());

        return q.peek();
    }

    public int size() {
        return length;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public void display() {
        System.out.println(q);
    }
}

public class StackUsingQueue {
    public static void main(String[] args) {
        MyStack_Queue stk = new MyStack_Queue();
        for (int i = 1; i <= 5; i++) stk.push(i * 10);
        stk.display();
        System.out.println(stk.pop());
        stk.display();
        System.out.println(stk.peek());
        System.out.println(stk.isEmpty());
        System.out.println(stk.size());
    }
}
