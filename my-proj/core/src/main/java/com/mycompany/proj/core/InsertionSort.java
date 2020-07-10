package com.mycompany.proj.core;

public class InsertionSort implements Sorter {

    @Override
    public int[] sort(int[] elementsToSort) {
        int n = elementsToSort.length;
        for (int i = 1; i < n; ++i) {
            int key = elementsToSort[i];
            int j = i - 1;
            while (j >= 0 && elementsToSort[j] > key) {
                elementsToSort[j + 1] = elementsToSort[j];
                j = j - 1;
            }
            elementsToSort[j + 1] = key;
        }
        return elementsToSort;    }
}
