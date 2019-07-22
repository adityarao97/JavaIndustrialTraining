package com.thread;

public class ThreadDemo {
    public static void main(String[] args) {
        MyThread obj1 = new MyThread("Child 1");
        MyThread obj2 = new MyThread("Child 2");
        obj1.start();
        obj2.start();
        for(int i=5;i>0;i--){
            System.out.println("Main Thread " + i);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("Main thread exit ********");
    }
}
