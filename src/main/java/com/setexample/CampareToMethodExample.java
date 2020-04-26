package com.setexample;

public class CampareToMethodExample {
    public static void main(String[] args) {
        System.out.println("A".compareTo("Z")); // -ve value
        System.out.println("Z".compareTo("B")); // +ve value
        System.out.println("A".compareTo("A")); // 0 value
        //System.out.println("A".compareTo(null)); //null pointer exception
    }
}
