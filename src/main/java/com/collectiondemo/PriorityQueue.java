package com.collectiondemo;

import java.util.Queue;

public class PriorityQueue {
    public static void main(String[] args) {
        Queue<String> queue = new java.util.PriorityQueue<>();
        queue.add("Rina");
        queue.add("Neha");
        queue.add("Shushma");
        //queue.add("Kumud");
        queue.add("Sonali");
        queue.add("Kumud");
        System.out.println(queue); //in order form
        System.out.println(queue.remove());
        System.out.println(queue.element());
        System.out.println(queue.peek());
        System.out.println(queue.poll());
    }
}
