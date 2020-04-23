package com.setexample;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet h = new LinkedHashSet();
        h.add("Z");
        h.add("Y");
        h.add(null);
        h.add(12);
        System.out.println(h.add("Z"));
        System.out.println(h);
    }
}
