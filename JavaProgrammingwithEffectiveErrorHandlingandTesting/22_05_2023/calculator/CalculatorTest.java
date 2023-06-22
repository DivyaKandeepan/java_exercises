package cgi.calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

@DisplayName("Calculator Tests")
public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    @Nested
    @DisplayName("Unit Tests")
    class UnitTests {
        @Test
        public void testAddition() {
            int result = calculator.add(5, 7);
            Assertions.assertEquals(12, result);
        }

        @Test
        public void testSubtraction() {
            int result = calculator.subtract(10, 3);
            Assertions.assertEquals(7, result);
        }

        @Test
        public void testMultiplication() {
            int result = calculator.multiply(4, 6);
            Assertions.assertEquals(24, result);
        }

        @Test
        public void testDivision() {
            int result = calculator.divide(15, 3);
            Assertions.assertEquals(5, result);
        }

        @Test
        public void testDivisionByZero() {
            Assertions.assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0));
        }
    }

    @Nested
    @DisplayName("Parameterized Tests")
    class ParameterizedTests {
        @DisplayName("Test addition with multiple operands")
        @ParameterizedTest
        @CsvSource({"2, 3, 5", "-5, 8, 3", "0, 0, 0"})
        public void testAddition(int a, int b, int expected) {
            int result = calculator.add(a, b);
            Assertions.assertEquals(expected, result);
        }

        @DisplayName("Test subtraction with multiple operands")
        @ParameterizedTest
        @CsvSource({"10, 3, 7", "5, 8, -3", "0, 0, 0"})
        public void testSubtraction(int a, int b, int expected) {
            int result = calculator.subtract(a, b);
            Assertions.assertEquals(expected, result);
        }
    }
}
