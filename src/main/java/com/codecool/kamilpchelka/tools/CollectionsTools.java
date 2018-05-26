package com.codecool.kamilpchelka.tools;

import java.util.Collection;

public class CollectionsTools {


    public boolean isSorted(Collection<? extends Integer> collection) {
        if (collection.isEmpty()) {
            throw new IllegalArgumentException("Collection cannot be empty !");
        } else if (collection.size() == 1) return true;

        Integer integer1 = null;

        for (Integer integer2 : collection) {

            if (integer1 == null) {
                integer1 = integer2;
                continue;
            }

            if (integer2 < integer1) return false;
        }

        return true;
    }

    public void swap(int[] array, int i1, int i2) {

        int temp = array[i1];

        array[i1] = array[i2];

        array[i2] = temp;

    }

}
