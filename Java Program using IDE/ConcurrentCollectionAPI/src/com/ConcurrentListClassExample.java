package com;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

class MyRunnable implements Runnable {
    List<Integer> list;
    MyRunnable(List<Integer> list) {
        this.list = list;
    }
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            list.add(i);
        }
    }
}
public class ConcurrentListClassExample {
    public static void main(String[] args) throws InterruptedException {
        //CopyOnWriteArrayList<String> list =new CopyOnWriteArrayList<>();
//        ArrayList<String> list = new ArrayList<String>();
//        list.add("CONFIG_1");
//        list.add("CONFIG_2");
//
//        for (String value : list) {
//            list.add("NEW_CONFIG");
//            System.out.println(value);
//        }
//
//        System.out.println("Final List: " + list);


        //List<Integer> list = new ArrayList<>();
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
        MyRunnable task = new MyRunnable(list);

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        // Expected: 2000, Actual: unpredictable
        System.out.println("Final size: " + list.size());


    }
}
