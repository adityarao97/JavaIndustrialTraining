package com.thread;

public class MyThreadR implements Runnable {

    Thread t;
    public MyThreadR(String name){
        t=new Thread(this,name);
        t.start();
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread() + " Run entered");
        for (int i=5;i>0;i--){
            System.out.println("Child Thread " + i);
            try{
                Thread.sleep(500);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread() + " Run exited **");
    }
}
