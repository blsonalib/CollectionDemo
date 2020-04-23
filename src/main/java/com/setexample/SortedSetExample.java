package com.setexample;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExample {
    public static void main(String[] args) {
        SortedSet sortedSet = new TreeSet();
        sortedSet.add(10);
        sortedSet.add(20);
        sortedSet.add(60);
        sortedSet.add(45);
        sortedSet.add(12);
        sortedSet.add(22);
        System.out.println(sortedSet);
        System.out.println(sortedSet.first());
        System.out.println(sortedSet.headSet(20));
        System.out.println(sortedSet.tailSet(45));
        System.out.println(sortedSet.last());
        System.out.println(sortedSet.comparator());
    }
}
