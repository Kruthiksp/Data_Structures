package com.kruthik.stack;

import java.util.Stack;

// Reverse a Stack using Recursion
public class ReverseStack {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        for(int i=1; i<=5; i++) {
            s.push(i*10);
        }
        System.out.println(s);
        reverse(s);
        System.out.println(s);
    }

    private static void reverse(Stack<Integer> s) {
        if(s.isEmpty()) return;
        int temp = s.pop();
        reverse(s);
        PushAtBottom.pushAtBottom(s, temp);
    }
}
