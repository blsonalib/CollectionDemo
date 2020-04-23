package com.mapdemo;

import java.util.Hashtable;
import java.util.Map;

public class HashTableExample {
    public static void main(String[] args) {
        Map<Integer,String> map = new Hashtable<>();
        map.put(101,"Kumud");
        map.put(102,"Sonali");
        map.put(103,"Prajkta");
        map.put(104,"Pranita");
        map.put(105,"Sonali");
        System.out.println(map);
        System.out.println(map.get(101));
        System.out.println(map.entrySet());
        System.out.println(map.getOrDefault(106,"surekha"));
    }
}
