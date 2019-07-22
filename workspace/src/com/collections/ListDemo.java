package com.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {
    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
        names.add("Aditya");
        names.add("Aditya2");
        names.add("Aditya3");
        names.add("Aditya4");
        ListIterator<String> iter = names.listIterator();
        while (iter.hasNext())
        {
            System.out.println(iter.next());
        }
        for(String s:names){
            System.out.println(s);
        }
        names.add(1,"Aditya0");
        for(String s:names){
            System.out.println(s);
        }

    }
}
