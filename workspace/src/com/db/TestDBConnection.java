package com.db;

import java.sql.Connection;

public class TestDBConnection {
    public static void main(String[] args) {
        Connection conn = DBConnectionManager.getConnection();
        if(conn!=null){
            System.out.println("Connection successful");
        }
    }
}
