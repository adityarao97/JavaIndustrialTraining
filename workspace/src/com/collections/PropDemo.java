package com.collections;

import java.io.FileOutputStream;
import java.util.Properties;

public class PropDemo {
    public static void main(String[] args) {
        Properties prop = new Properties();
        prop.put("Karnataka","Bengaluru");
        prop.put("Maharashtra","Mumbai");
        System.out.println(prop.getProperty("Karnataka"));
        System.out.println(prop.getProperty("MP","Not Found"));


    }
}
