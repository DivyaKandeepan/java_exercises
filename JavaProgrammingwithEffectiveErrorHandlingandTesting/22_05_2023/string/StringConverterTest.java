package cgi.string;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

@DisplayName("StringConverter Tests")
public class StringConverterTest {

    private StringConverter stringConverter;

    @BeforeEach
    public void setUp() {
        stringConverter = new StringConverter();
    }

    @Nested
    @DisplayName("Unit Tests")
    class UnitTests {
        @DisplayName("Test convertToUpperCase with lowercase string")
        @Test
        public void testConvertToUpperCase() {
            String input = "hello";
            String expectedOutput = "HELLO";
            String actualOutput = stringConverter.convertToUpperCase(input);
            Assertions.assertEquals(expectedOutput, actualOutput);
        }

        @DisplayName("Test convertToUpperCase with null input")
        @Test
        public void testConvertToUpperCaseWithNullInput() {
            String input = null;
            String actualOutput = stringConverter.convertToUpperCase(input);
            Assertions.assertNull(actualOutput);
        }
    }

    @Nested
    @DisplayName("Parameterized Tests")
    class ParameterizedTests {
        @DisplayName("Test convertToUpperCase with multiple lowercase strings")
        @ParameterizedTest
        @ValueSource(strings = {"hello", "world", "java"})
        public void testConvertToUpperCase(String input) {
            String expectedOutput = input.toUpperCase();
            String actualOutput = stringConverter.convertToUpperCase(input);
            Assertions.assertEquals(expectedOutput, actualOutput);
        }
    }
}
