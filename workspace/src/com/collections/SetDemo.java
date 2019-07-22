package com.collections;

import com.aditya.Student;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
//        Set<String> names = new TreeSet<>();
//        names.add("Adi");
//        names.add("Adi1");
//        names.add("Adi2");
//        names.add("Adi3");
//        names.add("Adi4");
//        for(String s:names){
//            System.out.println(s);
//        }
        Set<Student> students = new TreeSet<>();
        students.add(new Student(101,"adi"));
        students.add(new Student(102,"adi2"));
        students.add(new Student(104,"adi3"));
        for(Student s:students){
            System.out.println(s);
        }
    }
}
