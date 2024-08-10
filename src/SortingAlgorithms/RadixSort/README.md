# Radix Sort

**Radix Sort** is a non-comparison sorting algorithm that processes the digits of the numbers. It works by sorting the numbers based on their individual digits, starting from the least significant digit to the most significant one.

## Algorithm

1. Find the maximum number in the array.
2. Sort the array based on each digit from the least significant to the most significant.
3. Use counting sort as a subroutine to sort the array based on each digit.

## Example

Given an array `{170, 45, 75, 90, 802, 24, 2, 66}`, Radix Sort will sort the array as `{2, 24, 45, 66, 75, 90, 170, 802}`.

## Usage

To run the Radix Sort algorithm, compile and run the `RadixSort.java` file:

```bash
javac SortingAlgorithms/RadixSort/RadixSort.java
java SortingAlgorithms.RadixSort.RadixSort
```