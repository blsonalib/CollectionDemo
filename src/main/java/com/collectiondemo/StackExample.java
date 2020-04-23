package com.collectiondemo;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(12);
        s.push("A");
        s.push(19);
        s.push("B");
        s.push("C");
        s.push("D");
        System.out.println(s);
        s.pop();
        System.out.println(s.peek());
        System.out.println(s);
        s.empty();
        System.out.println(s);
        System.out.println(s.search("B"));
        System.out.println(s.search("Z"));
    }
}
