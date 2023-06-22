import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        final double PI = 3.14159;  // Declaring pi as a final variable
        
        // Read the radius from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        double radius = scanner.nextDouble();
        scanner.close();
        
        // Calculate the area of the circle
        double area = PI * radius * radius;
        
        // Print the result
        System.out.println("The area of the circle with radius " + radius + " is: " + area);
    }
}
