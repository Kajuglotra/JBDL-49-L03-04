package org.geeks;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class HeapDemo {
    public static void main(String[] args) {
        Queue<Integer> q = new PriorityQueue<>(Comparator.reverseOrder());
        q.offer(11);
        q.add(7);
        q.add(2);
        q.add(5);
        q.add(1);
        q.add(10);
        //peek()
        //poll()
        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q.peek());
     }
}

