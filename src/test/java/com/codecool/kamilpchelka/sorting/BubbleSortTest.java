package com.codecool.kamilpchelka.sorting;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class BubbleSortTest {


    @Test
    public void sort() {

        int[] data = {5, 3, 2, 4, 1};
        int[] sortedData = {1, 2, 3, 4, 5};
        assertArrayEquals(sortedData, new BubbleSort().sort(data));

    }
}