package com.codecool.kamilpchelka.sorting;

public class InsertionSort {

    public int[] sort(int[] data) {

        for (int x = 0; x < data.length - 1; x++) {

            for (int y = x + 1; y > 0; y--) {

                if (data[y - 1] > data[y]) {
                    int temp = data[y];

                    data[y] = data[y - 1];
                    data[y - 1] = temp;
                }

            }

        }

        return data;
    }
}
