package com.setexample;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet h = new HashSet();
        h.add("Z");
        h.add("Y");
        h.add(null);
        h.add(12);
        h.add("A");
        System.out.println(h.add("Z"));
        System.out.println(h.clone());
        System.out.println(h);
    }
}
