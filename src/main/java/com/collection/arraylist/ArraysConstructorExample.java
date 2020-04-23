package com.collection.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArraysConstructorExample {
    public static void main(String[] args) {
        List list = new ArrayList(1);
        list.add("sonali");
        list.add(10);
        list.add(null);
        list.add("sonali");
        list.add("sonali");
        list.add(10);
        list.add(null);
        list.add("sonali");
        System.out.println(list);
        System.out.println(list.contains(10));
        list.add(2,"seema");
        System.out.println(list);
        List list1 = new ArrayList();
        list1.add("Priya");
        list1.add(20);
        list1.add(2,89);
        System.out.println(list1);
        //list.addAll(list1);
        // System.out.println(list);
        list.addAll(2,list1);
        System.out.println(list);
        list.equals("seema");
    }
}
