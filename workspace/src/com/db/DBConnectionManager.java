package com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionManager {
    static{
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }
    public static Connection getConnection(){
        Connection conn=null;
        try{
            conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/sitdb","root","root");
        }catch (SQLException se){
            se.printStackTrace();
        }
        return conn;
    }
}
