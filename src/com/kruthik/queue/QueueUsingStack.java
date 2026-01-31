package com.kruthik.queue;

import java.util.Stack;

// Add efficient approach
// We can also do this in Remove efficient approach
class MyQueue_Stack {
    Stack<Integer> stk = new Stack<>();
    Stack<Integer> helper = new Stack<>();

    public void add(int x) {
        stk.push(x);
    }

    public int remove() {
        while (stk.size() > 1) helper.push(stk.pop());
        int num = stk.pop();
        while (!helper.isEmpty()) stk.push(helper.pop());
        return num;
    }

    public int peek() {
        while (stk.size() > 1) helper.push(stk.pop());
        int num = stk.peek();
        while (!helper.isEmpty()) stk.push(helper.pop());
        return num;
    }

    public void display() {
        System.out.println(stk);
    }
}

public class QueueUsingStack {
    public static void main(String[] args) {
        MyQueue_Stack q = new MyQueue_Stack();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.display();
        q.remove();
        q.display();
        System.out.println(q.peek());
        q.display();
    }
}
