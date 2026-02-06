package com;

import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExamples {
    public static void main(String[] args) {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new PriorityQueue<>();
        q1.add(4);q1.add(1);q1.add(6);q1.add(2);q1.add(5);
        q2.add(4);q2.add(1);q2.add(6);q2.add(2);q2.add(5);
        System.out.println(q1);
        System.out.println(q2);
        System.out.println(q1.poll());
        System.out.println(q2.poll());
        System.out.println(q1);
        System.out.println(q2);
    }
}
