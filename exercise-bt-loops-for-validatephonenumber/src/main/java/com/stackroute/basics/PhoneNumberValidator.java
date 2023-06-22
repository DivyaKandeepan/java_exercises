package com.stackroute.basics;
import java.util.Scanner;
public class PhoneNumberValidator {

    private Scanner scanner;
    
    public PhoneNumberValidator() {
        this.scanner = new Scanner(System.in);
    }
    
    public static void main(String[] args) {
        PhoneNumberValidator validator = new PhoneNumberValidator();
        String input = validator.getInput();
        int result = validator.validatePhoneNumber(input);
        validator.displayResult(result);
        validator.closeScanner();
    }
    
    public String getInput() {
        String input = this.scanner.nextLine().trim();
        return input;
    }
    
    public int validatePhoneNumber(String phoneNumber) {
        if (phoneNumber == null || phoneNumber.isEmpty()) {
            return -1; // invalid input
        }
        
        // remove all dashes from the phone number
        phoneNumber = phoneNumber.replaceAll("-", "");
        
        // check if the phone number contains only digits
        if (!phoneNumber.matches("\\d+")) {
            return 0; // invalid phone number
        }
        
        // check if the phone number has exactly 10 digits
        if (phoneNumber.length() != 10) {
            return 0; // invalid phone number
        }
        
        // valid phone number
        return 1;
    }
    
    public void displayResult(int result) {
        if (result == 1) {
            System.out.println("Valid");
        } else if (result == 0) {
            System.out.println("Invalid");
        } else {
            System.out.println("Empty string");
        }
    }
    
    
    public void closeScanner() {
        this.scanner.close();
    }
    
}

