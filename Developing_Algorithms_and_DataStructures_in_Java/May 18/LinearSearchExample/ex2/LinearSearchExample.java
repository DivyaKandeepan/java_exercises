import java.util.Scanner;

public class LinearSearchExample {
    public static void main(String[] args) {
        int[] arr = {5, 9, 3, 2, 7, 1, 6};
        int x = 2;

        // Perform linear search to find the element
        int index = linearSearch(arr, x);

        // Print the result
        if (index != -1) {
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element not found");
        }
    }

    public static int linearSearch(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i; // Element found, return the index
            }
        }
        return -1; // Element not found
    }
}
