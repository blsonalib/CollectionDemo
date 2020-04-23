package com.collectiondemo;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExample {
    public static void main(String[] args) {
        SortedSet<String> sortedSet = new TreeSet<>();
        sortedSet.add("Chanda");
        sortedSet.add("Priya");
        sortedSet.add("Jaya");
        sortedSet.add("Sneha");
        sortedSet.add("Riya");
        sortedSet.add("Ankita");
        sortedSet.add("Babita");
        sortedSet.add("Tina");
        sortedSet.add("Kavita");
        System.out.println("Sorted set:"+sortedSet);
        System.out.println("Sorted First :"+sortedSet.first());
        System.out.println("Sorted Last :"+sortedSet.last());
        SortedSet<String> beforeQuize = sortedSet.headSet("Chanda");  //before first element
        System.out.println(beforeQuize);
        SortedSet<String> betweenAnkitaAndChanda = sortedSet.subSet("Ankita","Chanda");
        System.out.println(betweenAnkitaAndChanda);
        SortedSet<String> afterSneha = sortedSet.tailSet("Sneha");
        System.out.println(afterSneha);
    }
}
