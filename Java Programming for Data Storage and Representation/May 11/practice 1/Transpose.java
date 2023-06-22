import java.util.Scanner;
public class Transpose {
        public static void main(String[] args) {
            int[][] matrix = new int[2][3];
            Scanner scanner = new Scanner(System.in);
    
            // Input array elements
            System.out.print("Enter array elements: ");
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 3; j++) {
                    matrix[i][j] = scanner.nextInt();
                }
            }
    
            // Original matrix
            System.out.println("Original matrix:");
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
    
            // Transposed matrix
            System.out.println("Transposed matrix:");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.print(matrix[j][i] + " ");
                }
                System.out.println();
            }
        }
    }
    