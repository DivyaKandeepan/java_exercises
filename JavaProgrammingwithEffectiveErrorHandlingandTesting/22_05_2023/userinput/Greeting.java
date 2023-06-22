package cgi.userinput;
import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        String message = generateGreeting(name);
        System.out.println(message);
    }

    public static String generateGreeting(String name) {
        if (name == null || name.trim().isEmpty()) {
            return "Hello, anonymous!";
        } else {
            return "Hello, " + name + "!";
        }
    }
}
