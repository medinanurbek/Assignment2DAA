package algorithms;

import metrics.PerformanceTracker;

public class InsertionSort {
    private final PerformanceTracker tracker;

    public InsertionSort(PerformanceTracker tracker) {
        this.tracker = tracker;
    }

    public void sort(int[] arr) {
        int n = arr.length;
        if (n <= 1) return;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            tracker.incrementComparisons();
            if (arr[j] <= key) {
                continue;
            }

            while (j >= 0) {
                tracker.incrementComparisons();
                if (arr[j] > key) {
                    arr[j + 1] = arr[j]; // сдвиг
                    tracker.incrementSwaps();
                    j--;
                } else {
                    break;
                }
            }
            arr[j + 1] = key;
        }
    }
}
