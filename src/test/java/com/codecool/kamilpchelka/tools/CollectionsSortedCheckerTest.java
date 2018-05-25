package com.codecool.kamilpchelka.tools;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CollectionsSortedCheckerTest {

    private CollectionsSortedChecker collectionsSortedChecker;

    @Before
    public void setup() {
        this.collectionsSortedChecker = new CollectionsSortedChecker();
    }


    @Test(expected = IllegalArgumentException.class)
    public void isSortedThrowsErrorIfCollectionIsEmpty() {

        collectionsSortedChecker.isSorted(new ArrayList<Integer>());

    }

    @Test
    public void isSortedReturnsTrueIfCollectionHasOneElement() {

        ArrayList<Integer> data = new ArrayList<>();

        data.add(1);

        assertTrue(collectionsSortedChecker.isSorted(data));

    }

    @Test
    public void isSortedReturnsFalseWithUnsortedCollection() {

        ArrayList<Integer> data = new ArrayList<>(Arrays.asList(5, 4, 3, 2, 1));

        assertFalse(collectionsSortedChecker.isSorted(data));

    }


    @Test
    public void isSortedReturnsTrueWithSortedCollection() {

        ArrayList<Integer> data = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        assertTrue(collectionsSortedChecker.isSorted(data));

    }

}