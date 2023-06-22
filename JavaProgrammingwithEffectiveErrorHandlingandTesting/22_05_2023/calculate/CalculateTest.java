package cgi;

import cgi.Calculate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CalculateTest {

    private Calculate calculator = new Calculate();

    //test for isEven method

    @ParameterizedTest
    @CsvSource({"4, true", "7, false", "0, true", "-2, true", "-5, false"})
    public void testIsEven(int num, boolean expected) {
        boolean actualResult = calculator.isEven(num);
        Assertions.assertEquals(expected, actualResult);
    }

    //test for addSum method

    @ParameterizedTest
    @CsvSource({"2, 3, 5", "-4, 6, 2", "0, 0, 0", "-7, -3, -10"})
    public void testAddSum(int a, int b, int expected) {
        int actualResult = calculator.addSum(a, b);
        Assertions.assertEquals(expected, actualResult);
    }

}
