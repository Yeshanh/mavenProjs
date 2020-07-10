package com.mycompany.proj.core;

public class BubbleSorter implements Sorter {

    @Override
    public int[] sort(int[] elementsToSort) {
        int n = elementsToSort.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (elementsToSort[j] > elementsToSort[j+1])
                {
                    // swap arr[j+1] and arr[i]
                    int temp = elementsToSort[j];
                    elementsToSort[j] = elementsToSort[j+1];
                    elementsToSort[j+1] = temp;
                }
        return elementsToSort;
    }
}
