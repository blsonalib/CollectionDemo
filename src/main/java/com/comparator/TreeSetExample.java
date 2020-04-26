package com.comparator;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet t = new TreeSet(new MyComparator());
        t.add(0);
        t.add(12);
        t.add(45);
        t.add(30);
        t.add(1);
        t.add(23);
        System.out.println(t);
    }
}
