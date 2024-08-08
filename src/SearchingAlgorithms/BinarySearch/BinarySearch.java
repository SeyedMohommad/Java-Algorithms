package SearchingAlgorithms.BinarySearch;


public class BinarySearch {

    public static int binarySearch(int[] array, int key) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if key is present at mid
            if (array[mid] == key) {
                return mid;
            }

            // If key greater, ignore left half
            if (array[mid] < key) {
                left = mid + 1;
            }
            // If key is smaller, ignore right half
            else {
                right = mid - 1;
            }
        }

        // Key not present
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        int key = 30;

        int result = binarySearch(array, key);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array");
        }
    }
}

