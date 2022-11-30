package com.java.se.oca.model.library;

public class Book {
    public String isbn;
    protected String author;
    int issueCount;
    public void printBook() {
        System.out.println("Printing Book");
    }
    protected void modifyTemplate() {
        countPages();
        System.out.println("Modifying template");
    }
    void issueHistory() {
        System.out.println("Issue History");
    }
    private void countPages() {
        System.out.println("Counting Pages");
    }
}
