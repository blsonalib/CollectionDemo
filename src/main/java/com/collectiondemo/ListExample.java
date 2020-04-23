package com.collectiondemo;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Neha");
        list.add("Kabir");
        list.add("Jyoti");
        list.add("Neha");
        System.out.println("List are : "+list.get(3));
        for (String l : list){
            System.out.println(l);
        }
    }

}
