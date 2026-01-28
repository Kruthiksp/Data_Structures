package com.kruthik.stack;

import java.util.Stack;

// Insert an element at the bottom of the stack using recursion
public class PushAtBottom {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        for(int i=0; i<5; i++) {
            s.push(i*10);
        }
        pushAtBottom(s, -10);
        System.out.println(s);
    }

    public static void pushAtBottom(Stack<Integer> s, int ele) {
        if(s.isEmpty()) {
            s.push(ele);
            return;
        }
        int temp = s.pop();
        pushAtBottom(s, ele);
        s.push(temp);
    }
}
