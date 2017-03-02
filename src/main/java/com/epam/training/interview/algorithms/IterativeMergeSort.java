package com.epam.training.interview.algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IterativeMergeSort {

    public static <T extends Comparable<? super T>> void sort(List<T> list) {
        if (list.isEmpty()) {
            return;
        }

        final List<T> auxiliary = new ArrayList<T>(Collections.nCopies(list.size(), null));
        sort(list, auxiliary);
    }

    private static <T extends Comparable<? super T>> void sort(List<T> list, List<T> auxiliary) {
        for (int current = 1; current <= list.size(); current = 2 * current) {
            for (int left = 0; left <= list.size(); left += 2 * current) {
                int middle = left + current - 1;
                int right = min(left + 2 * current - 1, list.size() - 1);
                merge(list, auxiliary, left, middle, right);
            }
        }
    }

    private static int min(int x, int y) {
        return (x < y) ? x : y;
    }

    private static <T extends Comparable<? super T>> void merge(List<T> list, List<T> auxiliary, int left, int middle, int right) {
        for (int k = left; k <= right; k++) {
            auxiliary.set(k, list.get(k));
        }

        int i = left;
        int j = middle + 1;
        for (int k = left; k <= right; k++) {
            if (i > middle) {
                list.set(k, auxiliary.get(j++));
            } else if (j > right) {
                list.set(k, auxiliary.get(i++));
            } else if (auxiliary.get(j).compareTo(auxiliary.get(i)) < 0) {
                list.set(k, auxiliary.get(j++));
            } else {
                list.set(k, auxiliary.get(i++));
            }
        }
    }

}
