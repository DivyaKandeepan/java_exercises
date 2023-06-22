import java.util.Scanner;

public class ExamGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter exam percentage: ");
        int percentage = scanner.nextInt();

        if (percentage > 90) {
            System.out.println("Excellent");
        } else if (percentage >= 80) {
            System.out.println("Great");
        } else if (percentage >= 70) {
            System.out.println("Good");
        } else {
            System.out.println("Needs improvement");
        }

        scanner.close();
    }
}
