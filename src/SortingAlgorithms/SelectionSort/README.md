# Selection Sort

**Selection Sort** is an in-place comparison sort algorithm that divides the list into a sorted and an unsorted part. It repeatedly selects the smallest (or largest) element from the unsorted part and moves it to the sorted part.

## Algorithm

1. Find the minimum element in the unsorted array.
2. Swap it with the element at the beginning of the unsorted part.
3. Move the boundary between the sorted and unsorted parts.
4. Repeat until the array is sorted.

## Example

Given an array `{64, 25, 12, 22, 11}`, Selection Sort will sort the array as `{11, 12, 22, 25, 64}`.

## Usage

To run the Selection Sort algorithm, compile and run the `SelectionSort.java` file:

```bash
javac SortingAlgorithms/SelectionSort/SelectionSort.java
java SortingAlgorithms.src.SelectionSort.SelectionSort
```