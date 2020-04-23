package com.collectiondemo;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public interface NavigableSetExample {
    public static void main(String[] args) {
        NavigableSet<String>navigableSet = new TreeSet<>();
        navigableSet.add("Priya");
        navigableSet.add("Jaya");
        navigableSet.add("Jayesh");
        navigableSet.add("Ritesh");
        navigableSet.add("Kamesh");
        System.out.println("Navigable set :"+navigableSet);
        System.out.println("Desending : "+navigableSet.descendingSet());
        System.out.println("Poll First :"+navigableSet.pollFirst());
        System.out.println("Poll Last :"+navigableSet.pollLast());
        System.out.println(navigableSet.ceiling("Priya"));
    }
}
