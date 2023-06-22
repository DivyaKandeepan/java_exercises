package com.stackroute.genericcollection;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GenericMapOperationsTest {

    private GenericMapOperations<Integer, Integer> integerMap;
    private GenericMapOperations<String, String> stringMap;

    @BeforeEach
    public void setUp() {
        integerMap = new GenericMapOperations<>(5);
        stringMap = new GenericMapOperations<>(3);
    }

    @Test
    public void givenIntegerMap_whenSetCalledWithValidKeyAndValue_thenElementIsAdded() {
        integerMap.set(1, 10);
        assertTrue(integerMap.containsKey(1));
        assertEquals(10, integerMap.get(1));
    }

    @Test
    public void givenStringMap_whenSetCalledWithValidKeyAndValue_thenElementIsAdded() {
        stringMap.set("key", "value");
        assertTrue(stringMap.containsKey("key"));
        assertEquals("value", stringMap.get("key"));
    }

    @Test
    public void givenIntegerMap_whenSetCalledWithNullKey_thenNullPointerExceptionIsThrown() {
        assertThrows(NullPointerException.class, () -> integerMap.set(null, 10));
    }

    @Test
    public void givenIntegerMap_whenSetCalledWithNullValue_thenNullPointerExceptionIsThrown() {
        assertThrows(NullPointerException.class, () -> integerMap.set(1, null));
    }

    @Test
    public void givenIntegerMap_whenSetCalledWithElementsMoreThanCapacity_thenOldestElementIsRemoved() {
        integerMap.set(1, 10);
        integerMap.set(2, 20);
        integerMap.set(3, 30);
        integerMap.set(4, 40);
        integerMap.set(5, 50);
        assertTrue(integerMap.containsKey(1));
        assertTrue(integerMap.containsKey(2));
        assertTrue(integerMap.containsKey(3));
        assertTrue(integerMap.containsKey(4));
        assertTrue(integerMap.containsKey(5));
        assertTrue(integerMap.containsKey(1));
    }

    @Test
    public void givenStringMap_whenSetCalledWithExistingKey_thenValueUpdated() {
        stringMap.set("key", "value1");
        stringMap.set("key", "value2");
        assertEquals("value2", stringMap.find("key"));
    }


    @Test
    public void givenIntegerMap_whenFindCalledWithExistingKey_thenValueIsReturned() {
        integerMap.set(1, 10);
        assertEquals(10, integerMap.find(1));
    }

    @Test
    public void givenIntegerMap_whenFindCalledWithNonExistingKey_thenNullIsReturned() {
        assertNull(integerMap.find(100));
    }

    @Test
    public void givenStringMap_whenFindCalledWithExistingKey_thenValueIsReturned() {
        stringMap.set("key", "value");
        assertEquals("value", stringMap.find("key"));
    }

    @Test
    public void givenStringMap_whenFindCalledWithNonExistingKey_thenNullIsReturned() {
        assertNull(stringMap.find("nonExistingKey"));
    }

    @Test
    public void givenNegativeCapacity_whenCreatingMap_thenIllegalArgumentExceptionIsThrown() {
        assertThrows(IllegalArgumentException.class, () -> new GenericMapOperations<>(-5));
    }
}
