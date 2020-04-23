package com.collectiondemo;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String>queue = new LinkedList<>();
        queue.add("Neha");
        queue.add("Shushma");
        queue.add("Kumud");
        queue.add("Sonali");
        queue.add("Kumud");
        System.out.println(queue);
        System.out.println(queue.remove());
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.isEmpty());
    }
}
