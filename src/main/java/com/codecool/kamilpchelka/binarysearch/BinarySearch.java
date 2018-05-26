package com.codecool.kamilpchelka.binarysearch;

import com.codecool.kamilpchelka.tools.CollectionsTools;

import java.util.ArrayList;

public class BinarySearch {

    private final ArrayList<Integer> data;

    public BinarySearch(ArrayList<Integer> data) {
        this.data = data;
        new CollectionsTools().isSorted(data);
    }

    public int get(int value) {

        int lowerBound = 0;
        int upperBound = data.size() - 1;
        int index = -1;


        while (lowerBound < upperBound) {

            int midPoint = lowerBound + (upperBound - lowerBound) / 2;


            if (data.get(midPoint) == value) {
                index = midPoint;
                break;
            } else if (data.get(midPoint) > value) {
                upperBound = midPoint - 1;
            } else {
                lowerBound = midPoint + 1;
            }


        }


        return index;
    }
}
