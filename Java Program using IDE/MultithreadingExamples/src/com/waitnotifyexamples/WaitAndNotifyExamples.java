package com.waitnotifyexamples;
class Resources implements  Runnable {
    @Override
    public synchronized void run() {
        String name = Thread.currentThread().getName();
        for(int i=0;i<=10;i++){
            try {
                Thread.sleep(500);
                System.out.println(name + " "+i);
                if(i==5 && name.equals("Ravi")){
                    wait();
                }
                if(i==4 && name.equals("Raju")){
                    //notify();
                    wait();
                }
                if(i==4 && name.equals("Ramesh")){
                    notifyAll();
                    //wait();
                }
            }catch (InterruptedException e){}
        }
    }
}
public class WaitAndNotifyExamples {
    public static void main(String[] args) {
       Resources res = new  Resources();
        new Thread(res,"Ravi").start();
        new Thread(res,"Ramesh").start();
        new Thread(res,"Raju").start();
    }
}
