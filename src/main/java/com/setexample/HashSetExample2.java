package com.setexample;

import java.util.HashSet;

public class HashSetExample2 {
    public static void main(String[] args) {
        HashSet h = new HashSet(1);
        h.add("Z");
        h.add("Y");
        h.add(null);
        h.add(12);
        h.add("A");
        h.add("B");
        h.add("C");
        h.add(20);
        h.add(121);
        h.add("G");
        h.add("F");
        h.add("G");
        h.add("H");
        h.add("I");
        h.add("J");
        h.add("K");
        h.add("L");
        h.add(23);
        h.add(56);
        System.out.println(h);
    }
}
