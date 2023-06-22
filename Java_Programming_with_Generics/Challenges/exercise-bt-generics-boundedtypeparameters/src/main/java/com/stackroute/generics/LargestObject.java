package com.stackroute.generics;

public class LargestObject {
    public <T extends Number & Comparable<T>> T findLargestNumber(T numberOne, T numberTwo, T numberThree) {
        T largestNumber = numberOne;
        if (numberTwo.compareTo(largestNumber) > 0) {
            largestNumber = numberTwo;
        }
        if (numberThree.compareTo(largestNumber) > 0) {
            largestNumber = numberThree;
        }
        return largestNumber;
    }

    public static void main(String[] args) {
        LargestObject largestObject = new LargestObject();


    }
    }
