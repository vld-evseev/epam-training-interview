package com.epam.training.interview.algorithms;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class RecursiveBubbleSortTest {

    @Test
    public void sortTestIntegers() throws Exception {
        final List<Integer> testIntegerList = Arrays.asList(1, 4, 9, 5, 2, 7, 6, 0, 3, 8);
        final List<Integer> sortedIntegerList = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);

        RecursiveBubbleSort.sort(testIntegerList);

        Assert.assertEquals(sortedIntegerList, testIntegerList);
    }

    @Test
    public void sortTestStrings() throws Exception {
        final List<String> testIntegerList = Arrays.asList("c", "f", "a", "z", "k");
        final List<String> sortedIntegerList = Arrays.asList("a", "c", "f", "k", "z");

        RecursiveBubbleSort.sort(testIntegerList);

        Assert.assertEquals(sortedIntegerList, testIntegerList);
    }

    @Test
    public void sortTestCornerCases() throws Exception {
        final List<Integer> testIntegerList = new ArrayList<>();
        final List<Integer> sortedIntegerList = Collections.emptyList();

        RecursiveBubbleSort.sort(testIntegerList);

        Assert.assertEquals(sortedIntegerList, testIntegerList);
    }

    @Test
    public void sortTestRandomArray() throws Exception {
        final List<Integer> testIntegerList = new ArrayList<>();
        fillWithRandomInts(testIntegerList, 1000);

        System.out.println("Unsorted: " + Arrays.toString(testIntegerList.toArray()));
        
        final List<Integer> sortedIntegerList = new ArrayList<>(testIntegerList.size());
        sortedIntegerList.addAll(testIntegerList);
        Collections.sort(sortedIntegerList);

        RecursiveBubbleSort.sort(testIntegerList);

        System.out.println("Sorted: " + Arrays.toString(testIntegerList.toArray()));

        Assert.assertEquals(sortedIntegerList, testIntegerList);
    }

    private void fillWithRandomInts(List<Integer> list, int size) {
        final Random random = new Random();

        for (int i = 0; i < size; i++) {
            list.add(i, random.nextInt(size));
        }
    }


}