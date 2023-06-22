package com.stackroute.strings;
import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public String checkAnagrams(String phrase1, String phrase2) {
        if (phrase1 == null || phrase2 == null || phrase1.trim().isEmpty() || phrase2.trim().isEmpty()) {
            return "Give proper input not empty phrases";
        }
    
        char[] phrase1Arr = phrase1.toCharArray();
        char[] phrase2Arr = phrase2.toCharArray();
    
        if (phrase1Arr.length != phrase2Arr.length) {
            return "Given phrases are not anagrams";
        }
    
        Arrays.sort(phrase1Arr);
        Arrays.sort(phrase2Arr);
    
        if (Arrays.equals(phrase1Arr, phrase2Arr)) {
            return "Given phrases are anagrams";
        } else {
            return "Given phrases are not anagrams";
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first phrase: ");
        String phrase1 = scanner.nextLine();
        System.out.print("Enter the second phrase: ");
        String phrase2 = scanner.nextLine();
        scanner.close();
        Anagram anagram = new Anagram();
        String result = anagram.checkAnagrams(phrase1, phrase2);
        System.out.println(result);
    }
}
