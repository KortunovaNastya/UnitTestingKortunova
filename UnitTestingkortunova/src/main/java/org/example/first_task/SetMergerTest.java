package org.example.first_task;

import org.junit.Test;


import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;



public class SetMergerTest {

    @Test
    public void testMergeWithNoIntersection() {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);

        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);

        SetMerger merger = new SetMerger();
        Set<Integer> result = merger.mergeSets(set1, set2);

        assertEquals(4, result.size());
        System.out.println("Test 1 (No intersection): " + result);
    }

    @Test
    public void testMergeWithSomeIntersection() {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);

        Set<Integer> set2 = new HashSet<>();
        set2.add(2);
        set2.add(3);

        SetMerger merger = new SetMerger();
        Set<Integer> result = merger.mergeSets(set1, set2);

        assertEquals(3, result.size());
        System.out.println("Test 2 (Some intersection): " + result);
    }

    @Test
    public void testMergeWithCompleteIntersection() {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);

        Set<Integer> set2 = new HashSet<>();
        set2.add(1);
        set2.add(2);

        SetMerger merger = new SetMerger();
        Set<Integer> result = merger.mergeSets(set1, set2);

        assertEquals(2, result.size());
        System.out.println("Test 3 (Complete intersection): " + result);
    }

    @Test
    public void testMergeEmptySets() {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        SetMerger merger = new SetMerger();
        Set<Integer> result = merger.mergeSets(set1, set2);

        assertEquals(0, result.size());
        System.out.println("Test 4 (Empty sets): " + result);
    }

    @Test
    public void testMergeOneEmptySet() {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);

        Set<Integer> set2 = new HashSet<>();

        SetMerger merger = new SetMerger();
        Set<Integer> result = merger.mergeSets(set1, set2);

        assertEquals(1, result.size());
        System.out.println("Test 5 (One empty set): " + result);
    }

}
