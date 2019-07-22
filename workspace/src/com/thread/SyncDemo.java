package com.thread;

public class SyncDemo {
    public static void main(String[] args) {
        Printer p = new Printer();
        User u1 = new User(p,"Hello");
        User u2 = new User(p,"World");
        User u3 = new User(p,"Synchronised");
        try{
            u1.t.join();
            u2.t.join();
            u3.t.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }

    }
}
