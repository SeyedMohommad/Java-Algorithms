# Merge Sort

**Merge Sort** is an efficient, stable, comparison-based, divide and conquer sorting algorithm. Most implementations produce a stable sort, meaning that the order of equal elements is the same in the input and output.

## Algorithm

1. Divide the unsorted list into `n` sublists, each containing one element.
2. Repeatedly merge sublists to produce new sorted sublists until there is only one sublist remaining.

## Example

Given an array `{12, 11, 13, 5, 6, 7}`, Merge Sort will sort the array as `{5, 6, 7, 11, 12, 13}`.

## Usage

To run the Merge Sort algorithm, compile and run the `MergeSort.java` file:

```bash
javac SortingAlgorithms/src/MergeSort/MergeSort.java
java SortingAlgorithms.src.MergeSort.MergeSort
```