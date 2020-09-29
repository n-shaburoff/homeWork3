package com.progKiev;

import java.util.Comparator;

public class ageComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        if (o1 == null & o2 != null) return -1;
        if (o1 == null & o2 == null) return 0;
        if (o1 != null & o2 == null) return 1;

        Person a = (Person) o1;
        Person b = (Person) o2;

        if (a.getAge() > b.getAge()) return 1;
        if (a.getAge() == b.getAge()) return 0;
        if (a.getAge() < b.getAge()) return -1;
        return 0;
    }
}
