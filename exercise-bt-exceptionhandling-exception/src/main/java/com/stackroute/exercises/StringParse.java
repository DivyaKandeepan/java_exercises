package com.stackroute.exercises;

public class StringParse {
    // Write logic to find the character from the sentence at specified location
    public char characterLocator(String sentence, String location) {
        try {
            int index = Integer.parseInt(location.trim());
            return sentence.charAt(index);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("NumberFormatException");
        } catch (StringIndexOutOfBoundsException e) {
            throw new StringIndexOutOfBoundsException("StringIndexOutOfBoundsException");
        }
    }

    public static void main(String[] args) {
        StringParse stringParse = new StringParse();
        String input = "Hello Everyone";
        String index = "8";

        try {
            char result = stringParse.characterLocator(input, index);
            System.out.println(result);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException");
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException");
        }
    }
}
