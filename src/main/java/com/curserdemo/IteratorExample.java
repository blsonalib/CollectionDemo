package com.curserdemo;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        for (int i =0;i<=10;i++){
            al.add(i);
            System.out.println(i);
        }
        Iterator iterator = al.iterator();
        while (iterator.hasNext()){
            Integer I = (Integer) iterator.next();
            System.out.println(I);
            if (I%2==0){
                System.out.println(I);
            }
            else {
                iterator.remove();
            }

        }
        System.out.println(al);
    }
}
