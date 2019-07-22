package com.AssignmentBMS;

import com.db.StudentDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class BMSOperations {
    static Scanner scanner = new Scanner(System.in);

    public static void add(){
        System.out.println("Enter Title");
        String title = scanner.nextLine();
        System.out.println("Enter ISBN");
        String ISBN = scanner.next();
        System.out.println("Enter Category");
        String category = scanner.next();
        System.out.println("Enter No of books");
        int quantity = scanner.nextInt();
        String sql="insert into book(ISBN,title,category,quantity) values(?,?,?,?)";
        int rows=0;
        try(Connection conn = DBConnectionManager.getConnection()){
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,ISBN);
            ps.setString(2,title);
            ps.setString(3,category);
            ps.setInt(4,quantity);
            rows=ps.executeUpdate();
        }catch (SQLException se){
            se.printStackTrace();
        }
        if(rows>0){
            System.out.println("Book added successfully");
        }
        else{
            System.out.println("Adding operation failed");
        }
    }

    public static void searchTitle(){
        System.out.println("Enter title to search");
        String title=scanner.nextLine();
        String sql="select * from book where title=?";
        try(Connection conn = new DBConnectionManager().getConnection()){
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,title);
            ResultSet rs = ps.executeQuery();
            if(rs!=null && rs.next()){
                System.out.println(rs.getString(1));
                System.out.println(rs.getString(2));
                System.out.println(rs.getString(3));
                System.out.println(rs.getString(4));
            }
        }catch (SQLException se){
            se.printStackTrace();
        }
    }

    public static void searchCategory(){
        System.out.println("Enter category to search");
        String category=scanner.next();
        String sql="select * from book where category=?";
        try(Connection conn = new DBConnectionManager().getConnection()){
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,category);
            ResultSet rs = ps.executeQuery();
            if(rs!=null && rs.next()){
                System.out.println(rs.getString(1));
                System.out.println(rs.getString(2));
                System.out.println(rs.getString(3));
                System.out.println(rs.getString(4));
            }
        }catch (SQLException se){
            se.printStackTrace();
        }
    }

    public static void searchAuthor(){
        System.out.println("Enter category to search");
        String author=scanner.next();
        String sql="select * from book where category=?";
        try(Connection conn = new DBConnectionManager().getConnection()){
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,author);
            ResultSet rs = ps.executeQuery();
            if(rs!=null && rs.next()){
                System.out.println(rs.getString(1));
                System.out.println(rs.getString(2));
                System.out.println(rs.getString(3));
            }
        }catch (SQLException se){
            se.printStackTrace();
        }
    }

    public static void list(){
        String sql="select * from book";
        List<String> list = new ArrayList<String>();
        try(Connection conn = new DBConnectionManager().getConnection()){
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs!=null && rs.next()){
                list.add(rs.getString(1));
            }
        }catch (SQLException se){
            se.printStackTrace();
        }
        int i=0;
        while(list.isEmpty()){
            System.out.println(list.get(i++));
        }
    }

    public static void issue(){
        System.out.println("Enter title of book to issue:");
        String title=scanner.nextLine();
        String sql="select * from book where title=?";
        int rows=0;
        try(Connection conn = new DBConnectionManager().getConnection()){
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,title);
            ResultSet rs = ps.executeQuery();
            if(rs!=null && rs.next()){
                System.out.println("Enter USN");
                String USN=scanner.next();
                System.out.println("Enter books ISBN");
                String isbn=scanner.next();
                String sql2="insert into issue(ID,USN,issueDate,returnDate,ISBN) values(?,?,?,?)";
                PreparedStatement ps2=conn.prepareStatement(sql2);
                ps2.setString(2, String.valueOf(LocalDate.now()));
                ps2.setString(3,String.valueOf(LocalDate.now()));
                ps2.setString(4,isbn);
                rows=ps.executeUpdate();
            }
        }catch (SQLException se){
            se.printStackTrace();
        }
        if(rows>0){
            System.out.println("Book issued");
        }
        else{
            System.out.println("Error issuing book");
        }
    }

    public static void listIssuedBook(){
        System.out.println("Enter ISBN no");
        String isbnVal=scanner.next();
        String sql="select book.title from issue,book where issue.isbn=isbnVal and issue.ISBN=book.ISBN";
        int rows=0;
        try(Connection conn=DBConnectionManager.getConnection()){
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            if(rs!=null && rs.next()){
                System.out.println(rs.getString(1));
            }
        }catch(SQLException se){
            se.printStackTrace();
        }
    }




}
