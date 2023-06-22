import java.util.Arrays;
import java.util.Scanner;

public class Bubble {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        Sort.bubblesort(arr);

        System.out.println("Sorted array: " + Arrays.toString(arr));

        scanner.close();
    }

    public static class Sort {
        public static void bubblesort(int[] arr) {
            for (int i = 1; i < arr.length; i++) {
                boolean swapped = false;
                for (int j = 0; j < arr.length - i; j++) {
                    if (arr[j] > arr[j + 1]) {
                        swapped = true;
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
                if (!swapped) {
                    break;
                }
            }
        }
    }
}
