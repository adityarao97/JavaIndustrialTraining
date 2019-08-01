package com.AssignmentBMS;

public class Issue {
    private String ID;
    private String USN;
    private String issueDate;
    private String returnDate;
    private String ISBN;
    public Issue(String ID,String USN,String issueDate,String returnDate,String ISBN){
        this.ID=ID;
        this.USN=USN;
        this.issueDate=issueDate;
        this.returnDate=returnDate;
        this.ISBN=ISBN;
    }
}
