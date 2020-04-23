package com.setexample;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExample2 {
    public static void main(String[] args) {
        SortedSet sortedSet = new TreeSet();
        sortedSet.add("Priya");
        sortedSet.add("meena");
        sortedSet.add("Anajali");
        sortedSet.add("supriya");
        sortedSet.add("Babita");
        sortedSet.add("shushma");
        System.out.println(sortedSet.last());

        System.out.println(sortedSet);
    }
}
