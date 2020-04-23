package com.curserdemo;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemoForword {
    public static void main(String[] args) {
        ArrayList l = new ArrayList();
        l.add("Priya");
        l.add("Jiya");
        l.add("Siya");
        l.add("Miya");
        l.add("Lina");
        System.out.println(l);
        ListIterator listIterator = l.listIterator();
        while (listIterator.hasNext()){
            String sl = (String) listIterator.next();
            if (sl.equals("Jiya")){
                listIterator.remove();
               // System.out.println(sl);
            }
            else if(sl.equals("Siya")){
               listIterator.add("Neha");
            }
            else if (sl.equals("Miya")){
                listIterator.set("Rama");
            }
        }
        System.out.println(l);
    }
}
