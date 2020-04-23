package com.mapdemo;

import java.util.*;

public class SortedMapExample {
    public static void main(String[] args) {
        SortedMap<Integer,String>sortedMap = new TreeMap<>();
        sortedMap.put(105,"Priya");
        sortedMap.put(106,"Neha");
        sortedMap.put(100,"Sonali");
        sortedMap.put(101,"Surabhi");
        sortedMap.put(104,"Miyami");
        sortedMap.put(103,"Janvi");
        Set s = sortedMap.entrySet();
        //System.out.println(s);
        Iterator i = s.iterator();
        while (i.hasNext()){
            Map.Entry m = (Map.Entry) i.next();
            int key = (int) m.getKey();
            String value = (String) m.getValue();
            System.out.println("Key :"+key+
                               " value :"+value);
        }
    }
}
