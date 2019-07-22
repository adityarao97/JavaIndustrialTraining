package com.aditya;

public class Student implements Comparable<Student> {

    public int rollNo;
    public String name;

    public Student(int rollNo,String name){
        this.rollNo=rollNo;
        this.name=name;
    }

    public String getName(){
        return name;
    }
    public int getRollNo(){
        return rollNo;
    }


    @Override
    public int compareTo(Student student) {
        return this.rollNo - student.rollNo;
    }
}
