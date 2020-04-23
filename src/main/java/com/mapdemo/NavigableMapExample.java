package com.mapdemo;

import java.util.*;

public class NavigableMapExample {
    public static void main(String[] args) {
        NavigableMap<Integer,String>navigableMap = new TreeMap<>();
        navigableMap.put(101,"Nita");
        navigableMap.put(107,"Riya");
        navigableMap.put(105,"Geeta");
        navigableMap.put(103,"Jiya");
        navigableMap.put(102,"Shweta");
        navigableMap.put(104,"Smita");
        navigableMap.put(100,"Ravina");
        Set s = navigableMap.entrySet();
        System.out.println(s);
        System.out.println(navigableMap.firstEntry());
        System.out.println(navigableMap.lowerEntry(107));
        System.out.println(navigableMap.floorEntry(100) );
        System.out.println(navigableMap.descendingMap());
    }
}
