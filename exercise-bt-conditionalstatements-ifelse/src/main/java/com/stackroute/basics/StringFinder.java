package com.stackroute.basics;

import java.util.Scanner;

public class StringFinder {
    private Scanner scanner;

    public StringFinder() {
        scanner = new Scanner(System.in);
    }

    // scan for input strings
    public String getInput() {
        //System.out.print("Enter the search string: ");
        String search = scanner.nextLine();
        String searchString=search.replaceAll("\\s+", "");
        //System.out.print("Enter the first string: ");
        String firstString = scanner.nextLine();
        //System.out.print("Enter the second string: ");
        String secondString = scanner.nextLine();

        return searchString + " " + firstString + " " + secondString;
    }

    // find whether second string comes after the first string in the search string
    public int findString(String searchString, String firstString, String secondString) {
        
        if (searchString == null || searchString.isEmpty() || firstString == null || firstString.isEmpty()
                || secondString == null || secondString.isEmpty()) {
            return -1;
        }
        
        int indexFirst = searchString.indexOf(firstString);
        if (indexFirst < 0) {
            return 0;
        }

        
        int indexSecond = searchString.indexOf(secondString, indexFirst + firstString.length());
        if (indexSecond < 0) {
            return 0;
        }
        
        if (indexSecond > indexFirst) {
            return 1;
        } else {
            return 0;
        }
    }

    // display the result
    public void displayResult(int result) {
        if (result == 1) {
            System.out.println("Found as expected");
        } else if (result == 0) {
            System.out.println("Not found");
        } else {
            System.out.println("Empty string or null");
        }
    }

    // close the scanner object
    public void closeScanner() {
        scanner.close();
    }

    public static void main(String[] args) {
        StringFinder sf = new StringFinder();
        String input = sf.getInput();
        int result = sf.findString(input.split(" ")[0], input.split(" ")[1], input.split(" ")[2]);
        sf.displayResult(result);
        sf.closeScanner();
    }
}
