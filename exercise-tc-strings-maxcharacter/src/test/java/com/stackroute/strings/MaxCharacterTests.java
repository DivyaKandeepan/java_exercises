package com.stackroute.strings;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxCharacterTests {

    private static MaxCharacter object;

    @BeforeEach
    public void setUp() {
        // This methods runs, before running each test case
        // This method is used to initialize the required variables
        object = new MaxCharacter();
    }

    @AfterEach
    public void tearDown() {
        // This method runs, after running each test case
        // This method is used to clear the initialized variables
        object = null;
    }

    @Test
     void givenAlphabeticStringValuesWhenCheckedThenReturnAStringResult(){
     char result = object.findMaxCharacterCount("memory");
     assertEquals('m',result);

     }

    @Test
     void givenSpecialCharactersStringValuesWhenCheckedThenReturnAStringResult(){
     char result = object.findMaxCharacterCount("11010234");
     assertEquals('1',result);

     }

     @Test
     void givenDigitsStringValuesWhenCheckedThenReturnAStringResult(){
     char result = object.findMaxCharacterCount("#$%@@");
     assertEquals('@',result);


     }

     @Test
    public void testFindMaxCharacterCount_AlphabeticString_AllCharactersSameCount() {
        String input = "hello";
        char expected = 'l';
        char result = object.findMaxCharacterCount(input);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testFindMaxCharacterCount_AlphabeticString_DifferentCharactersCount() {
        String input = "banana";
        char expected = 'a';
        char result = object.findMaxCharacterCount(input);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testFindMaxCharacterCount_NumericString_AllDigitsSameCount() {
        String input = "555";
        char expected = '5';
        char result = object.findMaxCharacterCount(input);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testFindMaxCharacterCount_StringWithSpecialCharacters() {
        String input = "!@#$%^&*()";
        char expected = '!';
        char result = object.findMaxCharacterCount(input);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testFindMaxCharacterCount_StringWithMixedCaseAlphabets() {
        String input = "StackRoute";
        char expected = 't';
        char result = object.findMaxCharacterCount(input);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testFindMaxCharacterCount_StringWithRepeatedMaxCharacter() {
        String input = "aabbbccccc";
        char expected = 'c';
        char result = object.findMaxCharacterCount(input);
        Assertions.assertEquals(expected, result);
    }



    
}
