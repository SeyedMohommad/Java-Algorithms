# Heap Sort

**Heap Sort** is a comparison-based sorting algorithm that uses a binary heap data structure. It is similar to selection sort, where we first find the maximum element and place the maximum element at the end. We repeat the same process for the remaining elements.

## Algorithm

1. Build a max heap from the input data.
2. At this point, the largest item is stored at the root of the heap. Replace it with the last item of the heap followed by reducing the size of the heap by 1. Finally, heapify the root.
3. Repeat the above steps until the heap size is reduced to 1.

## Example

Given an array `{12, 11, 13, 5, 6, 7}`, Heap Sort will sort the array as `{5, 6, 7, 11, 12, 13}`.

## Usage

To run the Heap Sort algorithm, compile and run the `HeapSort.java` file:

```bash
javac SortingAlgorithms/HeapSort/HeapSort.java
java SortingAlgorithms.HeapSort.HeapSort
```