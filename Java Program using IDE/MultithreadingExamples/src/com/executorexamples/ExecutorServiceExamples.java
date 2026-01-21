package com.executorexamples;

import java.lang.management.ThreadMXBean;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MyRunnable implements Runnable {
    @Override
    public void run() {
        Thread t=Thread.currentThread();
        System.out.println("MyRunnable run "+t);
    }
}
class MyCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        Thread t=Thread.currentThread();
        System.out.println("My Callable run "+t);
        return t.getName();
    }
}
public class ExecutorServiceExamples {
    public static void main(String[] args) throws Exception {
    MyRunnable r=new MyRunnable();

//    for(int i=0;i<10;i++) {
//        Thread t1 = new Thread(r);
//        t1.start();
//    }
    MyCallable c=new MyCallable();
//    Thread t2 = new Thread(c);
//    t2.start();
//        ExecutorService es = Executors.newSingleThreadExecutor();
//        es.submit(r);
//        Future<String> ff = es.submit(c);
//        System.out.println(ff.get());


       // ExecutorService es = Executors.newSingleThreadExecutor();
        //ExecutorService es = Executors.newFixedThreadPool(3);
        ExecutorService es = Executors.newCachedThreadPool();
        for(int i=0;i<10;i++){
            es.submit(r);

        }

        es.shutdown();
    }
}
