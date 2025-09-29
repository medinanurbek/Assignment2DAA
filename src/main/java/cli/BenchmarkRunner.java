package cli;

import algorithms.InsertionSort;
import metrics.PerformanceTracker;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class BenchmarkRunner {

    public static void main(String[] args) {
        int[] sizes = {100, 1000, 10000, 100000};
        String csvFile = "benchmark-results.csv";

        try (FileWriter writer = new FileWriter(csvFile)) {
            writer.write("n,time_ms,comparisons,swaps,arrayAccesses\n");

            for (int size : sizes) {
                int[] arr = generateRandomArray(size);
                PerformanceTracker tracker = new PerformanceTracker();
                InsertionSort sorter = new InsertionSort(tracker);

                long start = System.nanoTime();
                sorter.sort(arr);
                long end = System.nanoTime();

                double timeMs = (end - start) / 1e6;

                System.out.printf("n=%d | time=%.3f ms | %s%n",
                        size, timeMs, tracker);

                writer.write(String.format("%d,%.3f,%d,%d,%d\n",
                        size,
                        timeMs,
                        tracker.getComparisons(),
                        tracker.getSwaps(),
                        tracker.getArrayAccesses()));
            }

            System.out.println("\n✅ Benchmark finished. Results saved to " + csvFile);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static int[] generateRandomArray(int n) {
        Random random = new Random();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(10000);
        }
        return arr;
    }
}
