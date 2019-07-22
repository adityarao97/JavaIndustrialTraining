package com.aditya;

public class FlightProvider {
    public static void flying(String test){
        if(test.equals("BIRD_TYPE")){
            new Bird().fly();
        }
        if(test.equals("PLANE_TYPE")){
            new Plane().fly();
        }
        if(test.equals("SUPERMAN_TYPE")){
            new Superman().fly();
        }
    }
}
