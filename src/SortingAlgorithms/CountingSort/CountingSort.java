package SortingAlgorithms.CountingSort;

public class CountingSort {
    public static void countingSort(int[] array) {
        int max = findMax(array);
        int[] count = new int[max + 1];

        // Store the count of each element
        for (int i = 0; i < array.length; i++) {
            count[array[i]]++;
        }

        // Modify the count array by adding the previous counts
        for (int i = 1; i <= max; i++) {
            count[i] += count[i - 1];
        }

        // Build the output array
        int[] output = new int[array.length];
        for (int i = array.length - 1; i >= 0; i--) {
            output[count[array[i]] - 1] = array[i];
            count[array[i]]--;
        }

        // Copy the sorted elements into the original array
        for (int i = 0; i < array.length; i++) {
            array[i] = output[i];
        }
    }

    private static int findMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] array = {4, 2, 2, 8, 3, 3, 1};
        countingSort(array);
        System.out.println("Sorted array:");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
