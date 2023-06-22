package cgi.string;

public class StringConverter {
    public String convertToUpperCase(String input) {
        if (input == null) {
            return null;
        }
        return input.toUpperCase();
    }

    public static void main(String[] args) {
        StringConverter converter = new StringConverter();
        String input = "Hello, World!";
        String uppercase = converter.convertToUpperCase(input);
        System.out.println("Original: " + input);
        System.out.println("Uppercase: " + uppercase);
    }
}
