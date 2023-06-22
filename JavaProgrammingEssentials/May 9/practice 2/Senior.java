import java.util.Scanner;

public class Senior{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        
        if (age >= 60) {
            System.out.println("senior citizen.");
        } else {
            System.out.println("not a senior citizen.");
        }
    }
}
