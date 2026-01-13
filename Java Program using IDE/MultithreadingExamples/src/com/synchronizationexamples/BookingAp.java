package com.synchronizationexamples;
class BookingTicket  implements Runnable{
    int avl = 3;
    @Override
//    public synchronized void run() {
//        String name = Thread.currentThread().getName();
//        if(avl>0){
//            System.out.println(name+" Book the Ticket");
//            avl = avl-1;
//        }else {
//            System.out.println(name+" Sorry no ticket");
//        }
//    }

    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name+" is ready to book the ticket");

        synchronized (this) {
            if (avl > 0) {
                System.out.println(name + " Book the Ticket");
                avl = avl - 1;
            } else {
                System.out.println(name + " Sorry no ticket");
            }
        }

        System.out.println(name + " may be book ticket successfully or not");
    }
}
public class BookingAp {
    public static void main(String[] args) {
        BookingTicket bt = new BookingTicket(); // avl=3;
//        BookingTicket t2 = new BookingTicket(); // avl=3;
//        BookingTicket t3 = new BookingTicket(); // avl=3;
//        BookingTicket t4 = new BookingTicket(); // avl=3;
//        BookingTicket t5 = new BookingTicket(); // avl=3;
        Thread t1 = new Thread(bt,"Raj");
        Thread t2 = new Thread(bt,"Ravi");
        Thread t3 = new Thread(bt,"Ramesh");
        Thread t4 = new Thread(bt,"Ram");
        Thread t5 = new Thread(bt,"Raju");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
