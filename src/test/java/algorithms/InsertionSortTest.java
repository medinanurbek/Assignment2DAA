package algorithms;

import metrics.PerformanceTracker;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InsertionSortTest {

    @Test
    void testEmptyArray() {
        PerformanceTracker tracker = new PerformanceTracker();
        InsertionSort sorter = new InsertionSort(tracker);

        int[] arr = {};
        sorter.sort(arr);

        assertArrayEquals(new int[]{}, arr);
    }

    @Test
    void testSingleElement() {
        PerformanceTracker tracker = new PerformanceTracker();
        InsertionSort sorter = new InsertionSort(tracker);

        int[] arr = {5};
        sorter.sort(arr);

        assertArrayEquals(new int[]{5}, arr);
    }

    @Test
    void testDuplicates() {
        PerformanceTracker tracker = new PerformanceTracker();
        InsertionSort sorter = new InsertionSort(tracker);

        int[] arr = {3, 3, 3};
        sorter.sort(arr);

        assertArrayEquals(new int[]{3, 3, 3}, arr);
    }

    @Test
    void testSortedArray() {
        PerformanceTracker tracker = new PerformanceTracker();
        InsertionSort sorter = new InsertionSort(tracker);

        int[] arr = {1, 2, 3, 4, 5};
        sorter.sort(arr);

        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);
    }

    @Test
    void testReverseArray() {
        PerformanceTracker tracker = new PerformanceTracker();
        InsertionSort sorter = new InsertionSort(tracker);

        int[] arr = {5, 4, 3, 2, 1};
        sorter.sort(arr);

        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);
    }
}
