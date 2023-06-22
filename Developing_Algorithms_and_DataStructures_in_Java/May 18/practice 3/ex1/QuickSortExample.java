import java.util.Arrays;
import java.util.Scanner;

public class QuickSortExample {
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
        
        // Perform QuickSort on the input array
        quickSort(arr, 0, n - 1);
        
        // Print the sorted array
        System.out.println("Sorted array: " + Arrays.toString(arr));
        
        scanner.close();
    }
    
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Partition the array and get the pivot index
            int pivotIndex = partition(arr, low, high);
            
            // Recursively sort the subarrays on both sides of the pivot
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }
    
    public static int partition(int[] arr, int low, int high) {
        // Choose the rightmost element as the pivot
        int pivot = arr[high];
        
        // Index of the smaller element
        int i = low - 1;
        
        for (int j = low; j < high; j++) {
            // If the current element is smaller than or equal to the pivot
            if (arr[j] <= pivot) {
                i++;
                
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        
        // Swap arr[i+1] and arr[high] (pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        
        // Return the pivot index
        return i + 1;
    }
}
