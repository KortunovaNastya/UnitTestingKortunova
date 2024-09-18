package org.example.third_task;

import org.testng.annotations.Test;


import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverserTest {

    private final Reverser reverser = new Reverser();

    @Test
    public void testReverseKnownList() {
        List<Integer> originalList = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> expectedList = Arrays.asList(5, 4, 3, 2, 1);
        List<Integer> actualList = reverser.reverseList(originalList);
        assertEquals(expectedList, actualList);
    }

    @Test
    public void testReverseEmptyList() {
        List<Integer> originalList = Collections.emptyList();
        List<Integer> expectedList = Collections.emptyList();
        List<Integer> actualList = reverser.reverseList(originalList);
        assertEquals(expectedList, actualList);
    }

    @Test
    public void testReverseSingleElement() {
        List<Integer> originalList = Collections.singletonList(42);
        List<Integer> expectedList = Collections.singletonList(42);
        List<Integer> actualList = reverser.reverseList(originalList);
        assertEquals(expectedList, actualList);
    }

    @Test
    public void testReverseTwoElements() {
        List<Integer> originalList = Arrays.asList(1, 2);
        List<Integer> expectedList = Arrays.asList(2, 1);
        List<Integer> actualList = reverser.reverseList(originalList);
        assertEquals(expectedList, actualList);
    }

    @Test
    public void testReverseThreeElements() {
        List<Integer> originalList = Arrays.asList(1, 2, 3);
        List<Integer> expectedList = Arrays.asList(3, 2, 1);
        List<Integer> actualList = reverser.reverseList(originalList);
        assertEquals(expectedList, actualList);
    }
}
