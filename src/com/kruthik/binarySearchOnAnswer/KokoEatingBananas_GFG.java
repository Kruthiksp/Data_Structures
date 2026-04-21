package com.kruthik.binarySearchOnAnswer;

public class KokoEatingBananas_GFG {
    public int kokoEat(int[] arr, int k) {
        int max = Integer.MIN_VALUE;

        for (int ele : arr)
            max = Math.max(max, ele);

        int low = 1, high = max;
        int speed = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (hours(mid, arr) <= k) {
                high = mid - 1;
                speed = mid;
            }
            else low = mid + 1;
        }
        return speed;
    }

    private int hours(int speed, int[] arr) {
        int hours = 0;
        for (int bananas : arr) {
            if (bananas % speed == 0) hours += bananas / speed;
            else hours += (bananas / speed) + 1;
        }
        return hours;
    }
}
