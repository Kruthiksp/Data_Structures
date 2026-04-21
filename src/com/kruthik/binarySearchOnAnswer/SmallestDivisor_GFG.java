package com.kruthik.binarySearchOnAnswer;

public class SmallestDivisor_GFG {
    public int smallestDivisor(int[] arr, int k) {
        int max = Integer.MIN_VALUE;
        for (int ele : arr)
            max = Math.max(max, ele);

        int low = 1, high = max;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (quotientSum(mid, arr) <= k) {
                high = mid - 1;
                ans = mid;
            } else low = mid + 1;
        }
        return ans;
    }

    private int quotientSum(int divisor, int[] arr) {
        int quotient = 0;
        int sum = 0;

        for (int ele : arr) {
            if (ele % divisor == 0) sum += ele / divisor;
            else sum += (ele / divisor) + 1;
        }

        return sum;
    }
}
