package com.mapdemo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        Map<Integer,String>map = new HashMap<>();
        map.put(101,"Kumud");
        map.put(102,"Sonali");
        map.put(103,"Prajkta");
        map.put(104,"Pranita");
        map.put(105,"Sonali");
        System.out.println(map);
        System.out.println(map.entrySet());
        System.out.println(map.get(103));
        //System.out.println(map.equals(109));
    }
}
