package com.epam.training.interview.algorithms;

import java.util.List;

public class RecursiveBubbleSort {
    
    public static void sort(List<? extends Comparable> list) {
        if (list.isEmpty()) {
            return;
        }
        
        sort(list, list.size());
    }

    private static void sort(List<? extends Comparable> list, int limit) {
        if (limit == 1) {
            return; 
        }
        
        for (int i = 1; i < limit; i++) {
            if (list.get(i - 1).compareTo(list.get(i)) > 0) {
                swap(list, i - 1, i);
            }
        }
        
        sort(list, limit - 1);
    }

    private static <T extends Comparable> void swap(List<T> list, int i, int j) {
        final T next = list.set(j, list.get(i));
        list.set(i, next);
    }

}
