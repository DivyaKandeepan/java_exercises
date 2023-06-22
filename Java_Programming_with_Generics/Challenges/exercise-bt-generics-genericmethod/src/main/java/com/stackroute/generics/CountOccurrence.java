package com.stackroute.generics;
public class CountOccurrence {
    public <T> int findCount(T[] items, T item) {
        if (items == null) {
            return 0;
        }

        int count = 0;
        for (T element : items) {
            if (element == null) {
                if (item == null) {
                    count++;
                }
            } else if (element.equals(item)) {
                count++;
            }
        }

        return count;
    }




    public static void main(String[] args) {
        CountOccurrence countOccurrence = new CountOccurrence();

        Integer[] intArray = {2, 4, 7, 5, 4, 2};
        int count = countOccurrence.findCount(intArray, 4);
        System.out.println(count); // Output: 2

        count = countOccurrence.findCount(intArray, 10);
        System.out.println(count); // Output: 0

        Double[] doubleArray = {2.0, 4.4, 7.2, 1.5, 4.2, 2.0};
        count = countOccurrence.findCount(doubleArray, 2.0);
        System.out.println(count); // Output: 2

        String[] stringArray = {"Hello", "Hi", "Hello", null};
        count = countOccurrence.findCount(stringArray, null);
        System.out.println(count); // Output: 1
    }

}

