import java.util.Scanner;
public class BinarySearchExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input array from the user
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Get the element to be searched
        System.out.print("Enter the element to search: ");
        int x = scanner.nextInt();

        // Perform linear search to find the element
        int index = binarySearch(arr, x);

        // Print the result
        if (index != -1) {
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element not found");
        }

        scanner.close();
    }


    public static int binarySearch(int[] arr, int x) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == x) {
                return mid; // Element found, return the index
            } else if (arr[mid] < x) {
                low = mid + 1; // Search in the right half
            } else {
                high = mid - 1; // Search in the left half
            }
        }

        return -1; // Element not found
    }
}
