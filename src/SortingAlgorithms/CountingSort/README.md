# Counting Sort

**Counting Sort** is a non-comparison sorting algorithm suitable for small range integers. It is based on the keys being small integers; it counts the number of objects having distinct key values (kind of hashing).

## Algorithm

1. Count the number of occurrences of each value.
2. Store cumulative counts in an auxiliary array.
3. Place the elements in sorted order using the cumulative counts.

## Example

Given an array `{4, 2, 2, 8, 3, 3, 1}`, Counting Sort will sort the array as `{1, 2, 2, 3, 3, 4, 8}`.

## Usage

To run the Counting Sort algorithm, compile and run the `CountingSort.java` file:

```bash
javac SortingAlgorithms/src/CountingSort/CountingSort.java
java SortingAlgorithms.src.CountingSort.CountingSort
```