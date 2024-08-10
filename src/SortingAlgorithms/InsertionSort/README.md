# Insertion Sort

**Insertion Sort** is a simple sorting algorithm that builds the final sorted array one item at a time. It is much less efficient on large lists than more advanced algorithms such as quicksort, heapsort, or merge sort.

## Algorithm

1. Start with the second element in the array.
2. Compare it to the elements before it, moving those elements one position to the right until the correct position for the element is found.
3. Insert the element in the correct position.
4. Repeat for all elements in the array.

## Example

Given an array `{12, 11, 13, 5, 6}`, Insertion Sort will sort the array as `{5, 6, 11, 12, 13}`.

## Usage

To run the Insertion Sort algorithm, compile and run the `InsertionSort.java` file:

```bash
javac SortingAlgorithms/InsertionSort/InsertionSort.java
java SortingAlgorithms.src.InsertionSort.InsertionSort
```