package com.thread;

public class Clicker implements Runnable {
    long counter;
    Thread t;
    volatile boolean running = true;
    public Clicker(int priority){
        t = new Thread(this);
        t.setPriority(priority);
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread() + " Run method");
        while(running){
            counter++;
        }
    }
    public void stop(){
        System.out.println(Thread.currentThread() + " Stop method");
        running=false;
    }
    public void start(){
        System.out.println(Thread.currentThread() + " Start method");
        t.start();
    }
}
