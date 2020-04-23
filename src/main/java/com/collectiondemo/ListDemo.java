package com.collectiondemo;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Neha");
        list.add("Kabir");
        list.add("Jyoti");
        list.add("Neha");
        System.out.println("List are : "+list.get(3));
    }
}
