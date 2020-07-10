package com.mycompany.proj.core;

public class SelectSorter implements Sorter {

    @Override
    public int[] sort(int[] elementsToSort) {
        int n = elementsToSort.length;
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (elementsToSort[j] < elementsToSort[min_idx])
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            int temp = elementsToSort[min_idx];
            elementsToSort[min_idx] = elementsToSort[i];
            elementsToSort[i] = temp;
        }

        return elementsToSort;    }
}
