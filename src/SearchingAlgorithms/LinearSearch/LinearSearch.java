package SearchingAlgorithms.LinearSearch;

public class LinearSearch {

    public static int linearSearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1; // key not found
    }

    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        int key = 30;

        int result = linearSearch(array, key);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array");
        }
    }
}

