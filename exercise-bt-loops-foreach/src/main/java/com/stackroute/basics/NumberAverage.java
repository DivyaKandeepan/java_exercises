package com.stackroute.basics;

import java.util.Scanner;

public class NumberAverage {

    public static void main(String[] args) {
        new NumberAverage().getArrayValues();
    }

    // Get the values of the array from the user
    public void getArrayValues() {
        Scanner scanner = new Scanner(System.in);
        int size;
        // Prompt the user to enter the size of the array
        System.out.print("Enter the size of the array: ");
        size = scanner.nextInt();
        int[] inputArray = new int[size];
        // Prompt the user to enter the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            inputArray[i] = scanner.nextInt();
        }
        // Calculate the average of the array and display the result
        String averageResult = findAverage(inputArray);
        System.out.println(averageResult);
    }

    // Calculate the average of an array
    public String findAverage(int[] inputArray) {
        // Check if the array is empty
        if (inputArray.length == 0) {
            return "Empty array";
        }

        int sum = 0;
        // Iterate through each element in the array and calculate the sum
        for (int num : inputArray) {
            // Check if the array contains negative values
            if (num < 0) {
                return "Give proper positive integer values";
            }
            sum += num;
        }
        // Calculate the average by dividing the sum by the number of elements
        int average = sum / inputArray.length;
        return "The average value is: " + average;
    }
}
