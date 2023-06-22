package com.stackroute.strings;

import java.util.Scanner;

public class LongestSubString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        StringBuilder input = new StringBuilder(scanner.nextLine());
        scanner.close();
        System.out.println(findLongestSubString(input));
    }

    public static StringBuilder findLongestSubString(StringBuilder input) {
        if (input == null || input.length() == 0) {
            return new StringBuilder("Give proper input");
        }
        if (input.length() == 1) {
            return input;
        }
    
        int len = input.length();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < len / 2; i++) {
            StringBuilder temp = new StringBuilder(input.substring(0, i + 1));
            if (input.substring(len - i - 1, len).equals(temp.toString())) {
                result = temp;
            }
        }
        if (result.length() == 0) {
            result = new StringBuilder(input.charAt(0));
        }
    
        if (result.length() == 0) {
            return new StringBuilder("Longest substring is not present in the given StringBuilder");
        } else {
            return result;
        }
    }
    

}
