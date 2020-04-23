package com.collection.arraylist;

import java.util.LinkedList;

public class LinkedListConstructorExample {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add("seema");
        list.add("Rekha");
        list.add(10);
        list.add(null);
        list.add("seema");
        System.out.println(list);
        list.set(1,"Rupa");
        System.out.println(list);
        list.add(1,"Geeta");
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
        LinkedList list1 = new LinkedList();
        list1.addFirst(list);
        System.out.println(list);
        list1.addLast(list);
        System.out.println(list);
    }
}
