package org.example.second_task;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;


public class WordFrequencyCounterTest {

    @Test
    public void testCountWordFrequencySimple() {
        String sentence = "Hello world hello";
        CountWordFrequency counter = new CountWordFrequency();
        Map<String, Integer> result = counter.countWordFrequency(sentence);

        Map<String, Integer> expected = new HashMap<>();
        expected.put("hello", 2);
        expected.put("world", 1);

        assertEquals(expected, result);
        System.out.println("Test 1: " + result);
    }

    @Test
    public void testCountWordFrequencyWithPunctuation() {
        String sentence = "Hello, world! Hello.";
        CountWordFrequency counter = new CountWordFrequency();
        Map<String, Integer> result = counter.countWordFrequency(sentence);

        Map<String, Integer> expected = new HashMap<>();
        expected.put("hello", 2);
        expected.put("world", 1);

        assertEquals(expected, result);
        System.out.println("Test 2: " + result);
    }

    @Test
    public void testCountWordFrequencyEmptyString() {
        String sentence = "";
        CountWordFrequency counter = new CountWordFrequency();
        Map<String, Integer> result = counter.countWordFrequency(sentence);

        Map<String, Integer> expected = new HashMap<>();

        assertEquals(expected, result);
        System.out.println("Test 3: " + result);
    }

    @Test
    public void testCountWordFrequencySingleWord() {
        String sentence = "test test test";
        CountWordFrequency counter = new CountWordFrequency();
        Map<String, Integer> result = counter.countWordFrequency(sentence);

        Map<String, Integer> expected = new HashMap<>();
        expected.put("test", 3);

        assertEquals(expected, result);
        System.out.println("Test 4: " + result);
    }

    @Test
    public void testCountWordFrequencyMixedCase() {
        String sentence = "Java java JAVA JaVa";
        CountWordFrequency counter = new CountWordFrequency();
        Map<String, Integer> result = counter.countWordFrequency(sentence);

        Map<String, Integer> expected = new HashMap<>();
        expected.put("java", 4);

        assertEquals(expected, result);
        System.out.println("Test 5: " + result);
    }
}
