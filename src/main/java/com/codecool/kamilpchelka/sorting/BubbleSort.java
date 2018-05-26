package com.codecool.kamilpchelka.sorting;

import com.codecool.kamilpchelka.tools.CollectionsTools;

public class BubbleSort {


    public int[] sort(int[] data) {

        CollectionsTools collectionsTools = new CollectionsTools();

        if (data.length == 1) return data;

        for (int x = 0; x < data.length - 1; x++) {

            for (int y = 0; y < data.length - 1 - x; y++) {

                if (data[y] > data[y + 1]) {

                    collectionsTools.swap(data, y, y + 1);

                }


            }

        }


        return data;
    }
}
