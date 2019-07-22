package com.thread;

public class MyThread extends  Thread{
    public MyThread(String name){
        super(name);
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread() + " Run thread");
        for(int i=5;i>0;i--){
            System.out.println("Child Thread " + i);
            try{
                Thread.sleep(500);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread() + " Exit");
    }
}
