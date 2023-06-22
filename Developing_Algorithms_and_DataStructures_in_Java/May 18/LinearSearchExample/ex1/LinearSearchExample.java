import java.util.Scanner;

public class LinearSearchExample {
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
        int index = linearSearch(arr, x);

        // Print the result
        if (index != -1) {
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element not found");
        }

        scanner.close();
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
