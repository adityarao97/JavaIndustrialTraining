package com.thread;

public class RunnableDemo {
    public static void main(String[] args) {
        MyThreadR obj1=new MyThreadR("Child 1");
        try{
            obj1.t.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Main thread exit ****");
    }
}
