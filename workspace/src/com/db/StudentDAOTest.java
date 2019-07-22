package com.db;

import com.aditya.Student;
import org.junit.Ignore;

import static org.junit.Assert.*;

public class StudentDAOTest {

    @org.junit.Test
    @Ignore
    public void testRead(){
        StudentDAO dao = new StudentDAO();
        Student s = dao.getById(102);
        assertNotNull(s);
    }

    @org.junit.Test
//    @Ignore
    public void testCreate(){
        StudentDAO dao = new StudentDAO();
        assertTrue(dao.create(new Student(555,"Anil")));
    }
}