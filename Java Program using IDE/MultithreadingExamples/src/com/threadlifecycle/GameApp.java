package com.threadlifecycle;
class Car implements  Runnable{
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        //System.out.println(name+" is running");
        for(int i=0;i<=10;i++){
            System.out.println(name+" is moving with speed as "+(50+i)+"km/hr");
            try {
                Thread.sleep(500);
            }catch (InterruptedException e){}
        }
    }
}
public class GameApp {
    public static void main(String[] args) throws Exception {
        Car car = new Car();
        Thread t1 = new Thread(car);
        Thread t2 = new Thread(car);
        Thread t3 = new Thread(car);
        Thread t4 = new Thread(car);
//        System.out.println(t1.isAlive());
//        System.out.println(t2.isAlive());
//        System.out.println(t3.isAlive());
//        System.out.println(t4.isAlive());
        t1.setName("Car 1");
        t2.setName("Car 2");
        t3.setName("Car 3");
        t4.setName("Car 4");
        System.out.println("1...");
        Thread.sleep(1000);
        System.out.println("2...");
        Thread.sleep(1000);
        System.out.println("3...");
        Thread.sleep(1000);
        System.out.println("Game Start");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
       // Thread.sleep(1000);
//        System.out.println(t1.isAlive());
//        System.out.println(t2.isAlive());
//        System.out.println(t3.isAlive());
//        System.out.println(t4.isAlive());
        t1.join();   // main thread area
        t2.join();
        t3.join();
        t4.join();
        System.out.println("Game End");
    }
}
