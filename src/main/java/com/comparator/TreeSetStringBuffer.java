package com.comparator;

import java.util.TreeSet;

public class TreeSetStringBuffer {
    public static void main(String[] args) {
        TreeSet t = new TreeSet(new MyComparatorString());
        t.add(new StringBuffer("A"));
        t.add(new StringBuffer("Z"));
        t.add(new StringBuffer("V"));
        t.add(new StringBuffer("B"));
        t.add(new StringBuffer("M"));
        System.out.println(t);

    }
}
