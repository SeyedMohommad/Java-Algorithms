# Quick Sort

**Quick Sort** is an efficient, comparison-based, divide and conquer sorting algorithm. It is also known as partition-exchange sort. The algorithm works by selecting a 'pivot' element and partitioning the other elements into two sub-arrays according to whether they are less than or greater than the pivot.

## Algorithm

1. Pick a pivot element from the array.
2. Partition the array such that elements less than the pivot are on the left and elements greater than the pivot are on the right.
3. Recursively apply the same process to the sub-arrays until the whole array is sorted.

## Example

Given an array `{10, 7, 8, 9, 1, 5}`, Quick Sort will sort the array as `{1, 5, 7, 8, 9, 10}`.

## Usage

To run the Quick Sort algorithm, compile and run the `QuickSort.java` file:

```bash
javac SortingAlgorithms/QuickSort/QuickSort.java
java SortingAlgorithms.src.QuickSort.QuickSort
```