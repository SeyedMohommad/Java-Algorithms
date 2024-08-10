# Bucket Sort

**Bucket Sort** is a non-comparison sorting algorithm that distributes elements into buckets. Each bucket is then sorted individually, either using a different sorting algorithm or recursively applying the bucket sort.

## Algorithm

1. Create `n` empty buckets.
2. Put elements into different buckets based on their value.
3. Sort each bucket individually.
4. Concatenate all sorted buckets to get the final sorted array.

## Example

Given an array `{0.897, 0.565, 0.656, 0.1234, 0.665, 0.3434}`, Bucket Sort will sort the array as `{0.1234, 0.3434, 0.565, 0.656, 0.665, 0.897}`.

## Usage

To run the Bucket Sort algorithm, compile and run the `BucketSort.java` file:

```bash
javac SortingAlgorithms/src/BucketSort/BucketSort.java
java SortingAlgorithms.src.BucketSort.BucketSort
```