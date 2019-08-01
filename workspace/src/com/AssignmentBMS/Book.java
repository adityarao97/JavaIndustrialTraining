package com.AssignmentBMS;

public class Book {
    private String title;
    private String ISBN;
    private String category;
    private int quantity;

    public Book(String title,String ISBN,String category,int quantity){
        this.title=title;
        this.ISBN=ISBN;
        this.category=category;
        this.quantity=quantity;
    }
}
