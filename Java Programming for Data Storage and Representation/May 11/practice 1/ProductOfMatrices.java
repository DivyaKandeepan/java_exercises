import java.util.Scanner;

public class ProductOfMatrices {
        public static void main(String[] args) {
            int[][] m1 = new int[2][3];
            int[][] m2 = new int[3][2];
            int[][] productMatrix = new int[2][2];
            Scanner scanner = new Scanner(System.in);
    
            // Input elements of the first matrix
            System.out.println("Enter elements of the first matrix:");
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 3; j++) {
                    m1[i][j] = scanner.nextInt();
                }
            }
            // Input elements of the second matrix
            System.out.println("Enter elements of the second matrix:");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 2; j++) {
                    m2[i][j] = scanner.nextInt();
                }
            }
            // Perform matrix multiplication
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    int sum = 0;
                    for (int k = 0; k < 3; k++) {
                        sum += m1[i][k] * m2[k][j];
                    }
                    productMatrix[i][j] = sum;
                }
            }
            // Display the product matrix
            System.out.println("Product of two matrices:");
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.print(productMatrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
    