package com.codecool.kamilpchelka.binarysearch;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class BinarySearchTest {


    @Before
    public void setup() {
    }

    @Test
    public void getReturnsNegativeIndexIfGivenValueIsNotPreset() {

        BinarySearch binarySearch = new BinarySearch(
                new ArrayList<Integer>(Arrays.asList(1, 2, 4, 5, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16)));

        Assert.assertEquals(-1, binarySearch.get(6));
    }

    @Test
    public void getReturnsCorrectIndexIfGivenValueIsPresent() {


        BinarySearch binarySearch = new BinarySearch(
                new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16)));

        Assert.assertEquals(5, binarySearch.get(6));

    }


}