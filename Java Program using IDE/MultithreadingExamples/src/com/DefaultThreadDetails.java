package com;

public class DefaultThreadDetails {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println(t);
        t.setName("Default Thread");
        t.setPriority(Thread.MAX_PRIORITY);
       // t.setPriority(13);
        System.out.println(t);
        ThreadGroup tg = t.getThreadGroup();
        System.out.println(tg.activeCount());
    }
}
