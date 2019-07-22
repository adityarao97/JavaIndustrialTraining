package com.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(101,"Aditya");
        map.put(102,"Anil");
        map.put(103,"Akshay");
//        System.out.println(map.get(103));
        Set<Map.Entry<Integer,String>> entries = map.entrySet();
        for(Map.Entry<Integer,String> s : entries){
            System.out.println(s.getKey() + ":" + s.getValue());
        }
        Collection<String> values = map.values();
        for(String s: values){
            System.out.println(s);
        }
        Set<Integer> keyset = map.keySet();
        for(int x:keyset){
            System.out.println(x);
        }
    }
}
