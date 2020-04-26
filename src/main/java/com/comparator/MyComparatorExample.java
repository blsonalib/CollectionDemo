package com.comparator;

import java.util.Comparator;

public class MyComparatorExample implements Comparator {
    @Override
    public int compare(Object obj1, Object obj2) {
        Integer I1 = (Integer) obj1;
        Integer I2 = (Integer) obj2;
        //return 0;  //only first element insert and remaining element considered as duplicates
        //return I1.compareTo(I2); //ascending order
        // return -I1.compareTo(I2); //descending order
        // return I2.compareTo(I1); //descending order
        //return -I2.compareTo(I1) ; //ascending order
        // return +1; //insertion order
        return -1;// insertion in descending order

    }
}
