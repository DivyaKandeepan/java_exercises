import java.util.Scanner;

public class CharacterIndex {
    public static void main(String[] args) {
        String originalString = "java exercises!";
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the index: ");
        int index = scanner.nextInt();
        scanner.close();
        
        if (index >= 0 && index < originalString.length()) {
            char character = originalString.charAt(index);
            System.out.println("The character at position " + index + " is " + character);
        } else {
            System.out.println("Invalid index");
        }
    }
}
