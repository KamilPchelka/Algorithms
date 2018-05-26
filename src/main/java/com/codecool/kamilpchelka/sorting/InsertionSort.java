package com.codecool.kamilpchelka.sorting;

import com.codecool.kamilpchelka.tools.CollectionsTools;

public class InsertionSort {

    public int[] sort(int[] data) {
        CollectionsTools collectionsTools = new CollectionsTools();

        for (int x = 0; x < data.length - 1; x++) {

            for (int y = x + 1; y > 0; y--) {

                if (data[y - 1] > data[y]) {
                    collectionsTools.swap(data, y - 1, y);
                }

            }

        }

        return data;
    }
}
