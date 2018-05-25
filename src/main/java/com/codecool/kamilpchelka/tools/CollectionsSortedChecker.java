package com.codecool.kamilpchelka.tools;

import java.util.Collection;

public class CollectionsSortedChecker {


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

}
