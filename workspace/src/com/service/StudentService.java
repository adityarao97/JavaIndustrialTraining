package com.service;

import com.aditya.Student;
import com.db.StudentDAO;

import javax.swing.table.DefaultTableModel;

public class StudentService {
    public static boolean create(Student student){
        StudentDAO dao = new StudentDAO();
        return dao.create(student);
    }

    public static DefaultTableModel getTableModel()
    {
        StudentDAO dao = new StudentDAO();
        return dao.getTableModel();
    }


}
