public class BinarySearchExample {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int x = 6;

        // Perform binary search to find the element
        int index = binarySearch(arr, x);

        // Print the result
        if (index != -1) {
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element not found");
        }
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
