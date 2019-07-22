package com.thread;

public class Printer {
    public void print(String message){
        System.out.print("[" + message);
        try{
            Thread.sleep(500);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("]");
    }
}
