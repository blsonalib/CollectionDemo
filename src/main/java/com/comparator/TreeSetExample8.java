package com.comparator;

import java.util.TreeSet;

public class TreeSetExample8 {
    public static void main(String[] args) {
        TreeSet t = new TreeSet(new ComparatorForStringStringBuffer());
        t.add("A");
        t.add("A");
        t.add("ABC");
        t.add(new StringBuffer("ABCD"));
        t.add(new StringBuffer("AA"));
        t.add("XX");
        System.out.println(t);
    }
}
