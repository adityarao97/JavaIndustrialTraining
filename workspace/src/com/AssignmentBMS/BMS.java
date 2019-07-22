package com.AssignmentBMS;

import java.util.Scanner;

public class BMS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Book Management System");
        while(true){
            System.out.println("Choose your operation");
            System.out.println("1.Add a book 2.Search based on title 3.Search based on category 4.Search based on author " +
                    "5.List all 6.Issue a book " +
                    "7.List issued books based on USN 7.List pending books 8.Exit");
            int choice = scanner.nextInt();
            switch (choice){
                case 1:BMSOperations.add();break;
                case 2:BMSOperations.searchTitle();break;
                case 3:BMSOperations.searchCategory();break;
                case 4:BMSOperations.searchAuthor();break;
                case 5:BMSOperations.list();break;
                case 6:BMSOperations.issue();break;
                case 7:BMSOperations.listIssuedBook();break;
//                case 7:BMSOperations.listDueBooks();break;
                default:System.out.println("invalid entry");break;
                case 8:System.exit(1);
            }
        }
    }
}
