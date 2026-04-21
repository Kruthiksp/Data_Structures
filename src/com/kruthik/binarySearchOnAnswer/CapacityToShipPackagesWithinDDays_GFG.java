package com.kruthik.binarySearchOnAnswer;

public class CapacityToShipPackagesWithinDDays_GFG {
    public static int leastWeightCapacity(int[] arr, int n, int d) {
        int maxCap = 0;
        int maxWt = 0;

        for (int ele : arr) {
            maxCap += ele;
            maxWt = Math.max(maxWt, ele);
        }

        int low = maxWt;
        int high = maxCap;
        int ans = maxCap;   // worst case
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (daysRequired(mid, arr) <= d) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    private static int daysRequired(int capacity, int[] arr) {
        int sum = 0;
        int days = 1;

        for (int ele : arr) {
            if(sum + ele <= capacity) {
                sum += ele;
            } else {
                days++;
                sum = ele;
            }
        }
        return days;
    }
}
