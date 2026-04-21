package com.kruthik.binarySearchOnAnswer;

import java.util.Arrays;

public class AggressiveCows_GFG {
    public int aggressiveCows(int[] stalls, int k) {
        Arrays.sort(stalls);
        int n = stalls.length;

        int low = 1, high = stalls[n - 1] - stalls[0];
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (placeable(mid, stalls, k)) {
                low = mid + 1;
                ans = mid;
            } else high = mid - 1;
        }

        return ans;
    }

    private boolean placeable(int dist, int[] stalls, int k) {
        int count = 1;
        int previous = stalls[0];

        for (int i = 1; i < stalls.length; i++) {
            if (stalls[i] - previous >= dist) {
                count++;
                previous = stalls[i];
            }
            if (count == k) return true;
        }

        return false;
    }
}
