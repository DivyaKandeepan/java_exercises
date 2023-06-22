package cgi.userinput;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Greeting Tests")
public class GreetingTest {

    @DisplayName("Test generateGreeting with null name")
    @Test
    public void testGenerateGreetingWithNullName() {
        String name = null;
        String expectedMessage = "Hello, anonymous!";
        String actualMessage = Greeting.generateGreeting(name);
        Assertions.assertEquals(expectedMessage, actualMessage);
    }

    @DisplayName("Test generateGreeting with empty name")
    @Test
    public void testGenerateGreetingWithEmptyName() {
        String name = "";
        String expectedMessage = "Hello, anonymous!";
        String actualMessage = Greeting.generateGreeting(name);
        Assertions.assertEquals(expectedMessage, actualMessage);
    }

    @DisplayName("Test generateGreeting with a name")
    @Test
    public void testGenerateGreetingWithName() {
        String name = "John";
        String expectedMessage = "Hello, John!";
        String actualMessage = Greeting.generateGreeting(name);
        Assertions.assertEquals(expectedMessage, actualMessage);
    }
}
