package com.curserdemo;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemoPrevious {
    public static void main(String[] args) {
        ArrayList l = new ArrayList();
        l.add("Priya");
        l.add("Jiya");
        l.add("Siya");
        l.add("Miya");
        l.add("Lina");
        System.out.println(l);
        ListIterator listIterator = l.listIterator();
        while (listIterator.hasPrevious()){
            String s = (String) listIterator.previous();
            if(s.equals("Priya")){
                listIterator.add("Rama");
            }
            else if (s.equals("Miya")){
                listIterator.remove();
            }
            else if (s.equals("Jiya")){
                listIterator.set("Rita");
            }
        }
        System.out.println(l);
    }
}
