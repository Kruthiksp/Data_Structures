package com.kruthik.stack;

import java.util.Stack;

public class Baseball_Game_LC682 {
    public static void main(String[] args) {
        String[] arr = {"5","-2","4","C","D","9","+","+"};
        int ans = calPoints(arr);
        System.out.println(ans);
    }

    public static int calPoints(String[] operations) {
        int n = operations.length;
        int ans = 0;
        Stack<Integer> s = new Stack<>();

        for(int i=0; i<n; i++) {
            String str = operations[i];
            if(str.equals("C")) s.pop();
            else if(str.equals("D")) s.push(2*s.peek());
            else if(str.equals("+")) {
                int top = s.pop();
                int top2 = s.peek();
                int sum = top + top2;
                s.push(top);
                s.push(sum);
            }
            else {
                s.push(Integer.valueOf(str));
            }
        }
        while(!s.isEmpty()) {
            ans += s.pop();
        }
        return ans;
    }
}
