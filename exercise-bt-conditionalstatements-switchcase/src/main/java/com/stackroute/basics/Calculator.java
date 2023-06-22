package com.stackroute.basics;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        char choice;
        Scanner scanner = new Scanner(System.in);
        do {
            int firstValue = readInt(scanner);
            int secondValue = readInt(scanner);
            int operator = readInt(scanner);
            String result = calculate(firstValue, secondValue, operator);
            System.out.print(result);
            System.out.println("Do you want to try again(y/n)");
            choice = scanner.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');

        scanner.close();
    }

    public static int readInt(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            scanner.next();
        }
        return scanner.nextInt();
    }

    public static String calculate(int firstValue, int secondValue, int operator) {
        int result = 0;
        String operation = "";
        switch (operator) {
            case 1:
                operation = "+";
                result = firstValue + secondValue;
                break;
            case 2:
                operation = "-";
                result = firstValue - secondValue;
                break;
            case 3:
                operation = "*";
                result = firstValue * secondValue;
                break;
            case 4:
                if (secondValue == 0) {
                    return "The divider (secondValue) cannot be zero";
                }
                operation = "/";
                result = firstValue / secondValue;
                break;
            default:
                return "Entered wrong option " + operator;
        }
        return firstValue +" " + operation+" " + secondValue+" " + "="+" " + result;
    }
}
