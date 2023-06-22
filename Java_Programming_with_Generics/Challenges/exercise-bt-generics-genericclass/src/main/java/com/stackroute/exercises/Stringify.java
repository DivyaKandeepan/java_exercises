package com.stackroute.exercises;

import java.util.ArrayList;
import java.util.List;

public class Stringify<E> {
    private E[] array;

    public static void main(String[] args) {
        Stringify<String> stringStringify = new Stringify<>();
        String[] stringArray = {"Hi", "my", "name", "is", "Joel"};
        String result = stringStringify.inputValidator(stringArray);
        System.out.println(result); // Output: Hi my name is Joel

        Stringify<Character> charStringify = new Stringify<>();
        Character[] charArray = {'G', 'o', 'o', 'd', 'M', 'o', 'r', 'n', 'i', 'n', 'g'};
        result = charStringify.inputValidator(charArray);
        System.out.println(result); // Output: G o o d M o r n i n g

        // Test with null array
        String[] nullArray = null;
        result = stringStringify.inputValidator(nullArray);
        System.out.println(result); // Output: Given value is null

        // Test with array containing null value
        String[] arrayWithNull = {"Hi", "my", null, "is", "Joel"};
        result = stringStringify.inputValidator(arrayWithNull);
        System.out.println(result); // Output: Given array contains a null value
    }

    public String inputValidator(E[] array) {
        if (array == null) {
            return "Given value is null";
        }

        List<E> arrayList = new ArrayList<>();
        for (E element : array) {
            if (element == null) {
                return "Given array contains a null value";
            }

            String value = element.toString();
            if (value.trim().isEmpty()) {
                return "The given array contains one value which is empty or blank space";
            }

            arrayList.add(element);
        }

        if (arrayList.isEmpty()) {
            return "Given array is empty";
        }

        return stringGenerator(arrayList);
    }

    private String stringGenerator(List<E> arrayList) {
        StringBuilder stringBuilder = new StringBuilder();
        for (E element : arrayList) {
            stringBuilder.append(element.toString()).append(" ");
        }
        return stringBuilder.toString().trim();
    }
}
