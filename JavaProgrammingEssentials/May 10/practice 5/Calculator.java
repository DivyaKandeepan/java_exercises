import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter the operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        
        double result;
        
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("The sum of "+ num1 + " and " + num2 + " is "+ result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("The difference between "+ num1 + " and " + num2 + " is " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("The product of"+ num1 + " and " + num2 + " is " + result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("The division of"+ num1 + " and " + num2 + " is " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed");
                }
                break;
            default:
                System.out.println("Invalid input");
        }
        
        scanner.close();
    }
}
