package com.stackroute.basics;
import java.util.Scanner;
public class RectanglePerimeter {
    public static void main(String[] args) {
        RectanglePerimeter rectanglePerimeter = new RectanglePerimeter();
        rectanglePerimeter.getValues();
    }
    public double perimeterCalculator(double length, double breadth) {
        return 2 * (length + breadth);
    }
    public void getValues() {
        Scanner scanner = new Scanner(System.in);
        double length = scanner.nextDouble();
        double breadth = scanner.nextDouble();
        scanner.close();
        double perimeter = perimeterCalculator(length, breadth);
        System.out.println(perimeter);
    }
}
