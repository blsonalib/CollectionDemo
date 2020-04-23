package com.collectiondemo;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("Sonali");
        set.add("Priya");
        set.add("Neha");
        set.add("Shreyash");
        set.add("Sonali");
        System.out.println("Set Data Are : "+set);
        for (String s : set){
            System.out.println(s);
        }
    }
}
