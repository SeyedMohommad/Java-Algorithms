# Sorting Algorithms

This directory contains implementations of various sorting algorithms in Java. Each algorithm has its own subdirectory with the Java implementation and a dedicated `README.md` file explaining the algorithm, its usage, and examples.

## Overview

Sorting algorithms are fundamental in computer science and are widely used in various applications. This collection includes a range of sorting algorithms, from simple and intuitive ones to more complex and efficient algorithms.

## Algorithms Included

- [Selection Sort](./SelectionSort/README.md): A simple in-place comparison sort.
- [Bubble Sort](./BubbleSort/README.md): A comparison-based sorting algorithm that repeatedly steps through the list.
- [Insertion Sort](./InsertionSort/README.md): Builds the final sorted array one item at a time.
- [Merge Sort](./MergeSort/README.md): An efficient, stable, comparison-based, divide and conquer sorting algorithm.
- [Quick Sort](./QuickSort/README.md): An efficient, comparison-based, divide and conquer sorting algorithm.
- [Heap Sort](./HeapSort/README.md): A comparison-based sorting algorithm that uses a binary heap data structure.
- [Counting Sort](./CountingSort/README.md): A non-comparison sorting algorithm suitable for small range integers.
- [Radix Sort](./RadixSort/README.md): A non-comparison sorting algorithm that processes the digits of the numbers.
- [Bucket Sort](./BucketSort/README.md): A non-comparison sorting algorithm that distributes elements into buckets.

## Usage

Each algorithm can be run individually. Navigate to the specific algorithm's directory and compile the Java file using `javac`, then run it using `java`. For example, to run Selection Sort:

```bash
cd SelectionSort
javac SelectionSort.java
java SortingAlgorithms.src.SelectionSort.SelectionSort
```