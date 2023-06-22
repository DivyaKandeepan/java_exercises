import java.util.Arrays;
import java.util.Scanner;

public class Selection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        Sort.selection(arr);

        System.out.println("Sorted array: " + Arrays.toString(arr));

        scanner.close();
    }
}

    class Sort{
    public static void selection(int[] arr) {
        // The purpose of this loop is to select the minimum element and place it at the correct position.
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            
            // Find the minimum element in the unsorted part of the array
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            
            // Swap the minimum element with the current element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
    
}
