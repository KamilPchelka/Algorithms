package com.codecool.kamilpchelka.sorting;

public class BubbleSort {


    public int[] sort(int[] data) {

        if (data.length == 1) return data;

        for (int x = 0; x < data.length - 1; x++) {

            for (int y = 0; y < data.length - 1 - x; y++) {

                if (data[y] > data[y + 1]) {

                    int temp = data[y];

                    data[y] = data[y + 1];
                    data[y + 1] = temp;
                }


            }

        }


        return data;
    }
}
