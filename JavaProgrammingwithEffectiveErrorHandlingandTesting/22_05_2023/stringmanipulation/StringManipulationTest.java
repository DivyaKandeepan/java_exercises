package cgi.stringmanipulation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class StringManipulationTest {

    private StringManipulation stringManipulation = new StringManipulation();

    @ParameterizedTest
    @CsvSource({ "Hello, 2", "World, 1", "Java, 2"})
    public void testVowelCount(String name, int expectedCount) {
        int actualCount = stringManipulation.vowelCount(name);
        Assertions.assertEquals(expectedCount, actualCount);
    }

    @ParameterizedTest
    @CsvSource({ "Hello, 5", "World, 5", "Java, 4"})
    public void testCharacterCount(String str, int expectedCount) {
        int actualCount = stringManipulation.characterCount(str);
        Assertions.assertEquals(expectedCount, actualCount);
    }
}
