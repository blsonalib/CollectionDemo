package com.comparator;

import java.util.TreeSet;

public class TreeSetExample2 {
    public static void main(String[] args) {
        TreeSet t = new TreeSet(new MyComparatorExample());
        t.add(10);
        t.add(20);
        t.add(20);
        t.add(5);
        t.add(7);
        t.add(19);
        t.add(19);
        System.out.println(t);
    }
}
