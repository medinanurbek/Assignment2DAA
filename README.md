# Insertion Sort — Algorithmic Analysis Report

## 1. Introduction

This report presents the implementation and analysis of the **Insertion Sort algorithm** as part of Assignment 2: Algorithmic Analysis and Peer Code Review. 
The goal is to implement Insertion Sort in Java with optimization for nearly sorted data, validate correctness through unit testing, and benchmark performance empirically.

## 2. Algorithm Overview

Insertion Sort is a simple, comparison-based sorting algorithm. It iteratively takes one element from the input and places it into its correct position in the sorted portion of the array.

* Stable sorting algorithm.
* In-place: requires O(1) additional memory.
* Efficient on small and nearly sorted datasets.

**Pseudocode:**

```
for i = 1 to n-1
    key = arr[i]
    j = i - 1
    while j >= 0 and arr[j] > key
        arr[j+1] = arr[j]
        j = j - 1
    arr[j+1] = key
```


## 3. Complexity Analysis

| Case    | Comparisons | Swaps/Shifts | Time Complexity |
| ------- | ----------- | ------------ | --------------- |
| Best    | ~ n         | 0            | Ω(n)            |
| Average | ~ n² / 4    | ~ n² / 4     | Θ(n²)           |
| Worst   | ~ n² / 2    | ~ n² / 2     | O(n²)           |

* **Best Case:** Array already sorted → linear time.
* **Worst Case:** Reverse-sorted array → quadratic time.
* **Space Complexity:** O(1).


## 4. Implementation

* Implemented in Java (`InsertionSort.java`).
* Uses `PerformanceTracker` to measure **comparisons**, **swaps**, and **array accesses**.
* Optimization: Early exit if the current element is already ≥ previous element.
  
Insert screenshot of InsertionSort.java (loop with optimization)
Insert screenshot of PerformanceTracker.java (increment methods)


## 5. Unit Testing

Implemented with JUnit 5:

* Empty array
* Single element
* Duplicates
* Already sorted array
* Reverse-sorted array

📌 Insert screenshot of InsertionSortTest.java
📌 Insert screenshot of IntelliJ IDEA with "5 tests passed"


## 6. Benchmarking

Benchmarks run on arrays of size 100, 1,000, 10,000, and 100,000.

Insert screenshot of BenchmarkRunner.java
Insert screenshot of console output

### Results Table

| n       | Time (ms) | Comparisons   | Swaps         | ArrayAccesses |
| ------- | --------- | ------------- | ------------- | ------------- |
| 100     | 0.301     | 2,812         | 2,630         | 0             |
| 1,000   | 4.723     | 246,783       | 244,792       | 0             |
| 10,000  | 40.182    | 24,733,589    | 24,713,609    | 0             |
| 100,000 | 2,370.841 | 2,504,720,465 | 2,504,520,493 | 0             |


## 7. Graphs

Insert Time vs n graph (time_plot.png)
Insert Comparisons & Swaps graph (comparisons_plot.png)

* Time Complexity: Quadratic growth as n increases.
* Operations: Comparisons and swaps also grow ~O(n²).


## 8. Conclusion

* Strengths:

  * Excellent for nearly sorted data (Ω(n)).
  * Stable and in-place (O(1) memory).
  * Easy to implement.

* Weaknesses:

  * Poor scalability for large datasets (Θ(n²)).
  * High number of comparisons and swaps.

Insertion Sort is best used for small or nearly sorted arrays. For large datasets, advanced algorithms such as Merge Sort or Quick Sort are more efficient.


✍️ Prepared for **Assignment 2: Algorithmic Analysis and Peer Code Review**
