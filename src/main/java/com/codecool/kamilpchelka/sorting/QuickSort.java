package com.codecool.kamilpchelka.sorting;

import com.codecool.kamilpchelka.tools.CollectionsTools;

public class QuickSort {

    CollectionsTools collectionsTools = new CollectionsTools();

    public int[] sort(int[] data) {

        quickSort(data, 0, data.length - 1);

        return data;
    }

    public void quickSort(int[] array, int lowerBound, int upperBound) {

        if (lowerBound >= upperBound) return;

        int pivot = array[upperBound];

        int i = lowerBound - 1;
        int j = lowerBound;

        while (j < upperBound) {
            if (array[j] < pivot) collectionsTools.swap(array, ++i, j);
            ++j;
        }

        collectionsTools.swap(array, i + 1, upperBound);

        quickSort(array, lowerBound, i);
        quickSort(array, i + 1, upperBound);


    }
}
