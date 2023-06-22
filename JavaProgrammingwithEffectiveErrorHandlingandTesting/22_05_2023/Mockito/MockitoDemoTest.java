package cgi.Mockito;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

public class MockitoDemoTest {

    @Test
    public void testListMock() {
        // Create a mock of the List interface
        List<String> mockList = mock(List.class);
        // Configure the behavior of the mock object
        when(mockList.get(0)).thenReturn("Apple");
        when(mockList.size()).thenReturn(1);

        // Create an instance of MockitoDemo
        MockitoDemo mockitoDemo = new MockitoDemo();

        // Set the mocked list as the fruits
        mockitoDemo.setFruits(mockList);

        // Perform the test using the MockitoDemo instance
        assertEquals("Apple", mockitoDemo.getFruits().get(0));
        assertEquals(1, mockitoDemo.getFruits().size());
    }

    @Test
    public void testListSpy() {
        // Create a spy of an actual ArrayList object
        List<String> spyList = spy(new ArrayList<>());

        // Add some elements to the spy list
        spyList.add("Apple");
        spyList.add("Banana");
        spyList.add("Orange");

        // Configure the behavior of the spy object
        when(spyList.get(0)).thenReturn("Mocked Apple");
        when(spyList.size()).thenReturn(10);

        // Create an instance of MockitoDemo
        MockitoDemo mockitoDemo = new MockitoDemo();

        // Set the spy list as the fruits
        mockitoDemo.setFruits(spyList);

        // Perform the test using the MockitoDemo instance
        assertEquals("Mocked Apple", mockitoDemo.getFruits().get(0));
        assertEquals(10, mockitoDemo.getFruits().size());
    }
}
