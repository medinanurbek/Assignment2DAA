import algorithms.InsertionSort;
import metrics.PerformanceTracker;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};
        PerformanceTracker tracker = new PerformanceTracker();
        InsertionSort sorter = new InsertionSort(tracker);

        sorter.sort(arr);

        System.out.println("Sorted: " + Arrays.toString(arr));
        System.out.println(tracker);
    }
}

