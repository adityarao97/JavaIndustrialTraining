package com.db;

import com.aditya.Student;

import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class StudentDAO {

    public DefaultTableModel getTableModel()
    {
        String sql = "select rollNo,name from student2";
        Vector<String> colNames = new Vector<>();
        colNames.add("RollNo");
        colNames.add("Name");
        Vector<Vector<String>> data = new Vector<>();

        try(Connection conne = DBConnectionManager.getConnection())
        {
            PreparedStatement ps = conne.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs!=null && rs.next())
            {
                Vector<String> row = new Vector<>();
                row.add(String.valueOf(rs.getInt(1)));
                row.add(rs.getString(2));
                data.add(row);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return  new DefaultTableModel(data,colNames);
    }

    public List<Student> getAllStudent() {
        String sql = "select rollNo,name from student2";
        ArrayList<Student> list = new ArrayList<>();
        Student s = null;
        try (Connection conn = DBConnectionManager.getConnection()) {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs != null && rs.next()) {
                s = new Student(rs.getInt(1), rs.getString(2));
                list.add(s);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public Student getById(int rollno){
        String sql="select name from student2 where rollNo=?";
        Student s = null;
        try(Connection conn = DBConnectionManager.getConnection()){
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1,rollno);
            ResultSet rs = ps.executeQuery();
            if(rs!=null && rs.next()){
                s = new Student(rollno,rs.getString(1));
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return s;
    }

    public static boolean create(Student student){
        String sql = "insert into student2(rollNo,name) values(?,?)";
        int rows=0;
        try(Connection conn=DBConnectionManager.getConnection()){
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1,student.getRollNo());
            ps.setString(2,student.getName());
            rows=ps.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
        return rows>0;
    }
}
