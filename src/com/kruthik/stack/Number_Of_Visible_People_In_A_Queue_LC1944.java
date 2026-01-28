package com.kruthik.stack;

import java.util.Arrays;
import java.util.Stack;

public class Number_Of_Visible_People_In_A_Queue_LC1944 {
    public static void main(String[] args) {
        int[] heights = {10,6,8,5,11,9};
        int[] ans = canSeePersonsCount(heights);

        System.out.println(Arrays.toString(ans));
    }
    public static int[] canSeePersonsCount(int[] heights) {
        int n = heights.length;
        int[] ans = new int[n];
        Stack<Integer> s = new Stack<>();
        ans[n-1] = 0;
        s.push(heights[n-1]);

        for(int i=n-2; i>=0; i--) {
            int count = 0;
            int num = heights[i];
            while(!s.isEmpty() && s.peek() <= num) {
                count++;
                s.pop();
            }
            if(!s.isEmpty()) count++;
            ans[i] = count;
            s.push(num);
        }

        return ans;
    }
}
