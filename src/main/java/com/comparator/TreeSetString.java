package com.comparator;

import java.util.TreeSet;

public class TreeSetString {
    public static void main(String[] args) {
        TreeSet t = new TreeSet(new MyComparatorString());
        t.add("Rahul");
        t.add("Ramesh");
        t.add("Sonali");
        t.add("Sona");
        t.add("Anamika");
        t.add("Kumud");
      //  t.add("kumud");
        System.out.println(t);
    }
}
