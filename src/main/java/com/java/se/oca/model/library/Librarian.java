package com.java.se.oca.model.library;

public class Librarian {

    public Librarian() {
        Book book = new Book();
        book.author = "Author Name";
        book.modifyTemplate();
        int c = book.issueCount;
        book.issueHistory();
    }
}
