package com.db;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.aditya.Student;
import com.db.StudentDAO;
import org.junit.Ignore;
import org.junit.jupiter.api.Test;

public class TestStudentDAO {

//    @Test
//    public void testRead(){
//        StudentDAO dao = new StudentDAO();
//        Student s = dao.getById(102);
//        assertNotNull(s);
//    }
    @Test
    @Ignore
    public void testCreate(){
        StudentDAO dao = new StudentDAO();
        assertTrue(dao.create(new Student(555,"Anil")));
    }
}
