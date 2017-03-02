package com.epam.training.interview.algorithms;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class RecursiveMergeSortTest {
    
    @Test
    public void testIntegers() {
        final List<Integer> testIntegerList = Arrays.asList(1, 4, 9, 5, 2, 7, 6, 0, 3, 11, 8);
        final List<Integer> sortedIntegerList = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 11);

        RecursiveMergeSort.sort(testIntegerList);

        Assert.assertEquals(sortedIntegerList, testIntegerList);
    }

    

}