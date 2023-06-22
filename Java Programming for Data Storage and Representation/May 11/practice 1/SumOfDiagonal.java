import java.util.Scanner;

public class SumOfDiagonal {
    public static void main(String[] args) {
        int[][] array2D = new int[3][3];
        Scanner scanner = new Scanner(System.in);

        // Input array elements
        System.out.print("Enter array elements: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array2D[i][j] = scanner.nextInt();
            }
        }

        int sumLeftDiagonal = 0;
        int sumRightDiagonal = 0;

        // Calculate sum of left diagonal and right diagonal elements
        for (int i = 0; i < 3; i++) {
            sumLeftDiagonal += array2D[i][i];
            sumRightDiagonal += array2D[i][2 - i];
        }

        // Display the results
        System.out.println("Left diagonal elements: ");
        for (int i = 0; i < 3; i++) {
            System.out.print(array2D[i][i] + " ");
        }
        System.out.println("\nSum of left diagonal elements: " + sumLeftDiagonal);

        System.out.println("Right diagonal elements: ");
        for (int i = 0; i < 3; i++) {
            System.out.print(array2D[i][2 - i] + " ");
        }
        System.out.println("\nSum of right diagonal elements: " + sumRightDiagonal);
    }
}
