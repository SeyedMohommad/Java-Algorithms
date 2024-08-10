package SortingAlgorithms.BucketSort;

import java.util.ArrayList;
import java.util.Collections;


public class BucketSort {

    public static void bucketSort(float[] array) {
        int n = array.length;
        if (n <= 0)
            return;

        // Create empty buckets
        @SuppressWarnings("unchecked")
        ArrayList<Float>[] buckets = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            buckets[i] = new ArrayList<Float>();
        }

        // Add array elements into different buckets
        for (int i = 0; i < n; i++) {
            int bucketIndex = (int) (n * array[i]);
            buckets[bucketIndex].add(array[i]);
        }

        // Sort individual buckets
        for (int i = 0; i < n; i++) {
            Collections.sort(buckets[i]);
        }

        // Concatenate all buckets into array[]
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (float val : buckets[i]) {
                array[index++] = val;
            }
        }
    }

    public static void main(String[] args) {
        float[] array = {(float) 0.897, (float) 0.565, (float) 0.656, (float) 0.1234, (float) 0.665, (float) 0.3434};
        bucketSort(array);
        System.out.println("Sorted array:");
        for (float i : array) {
            System.out.print(i + " ");
        }
    }
}
