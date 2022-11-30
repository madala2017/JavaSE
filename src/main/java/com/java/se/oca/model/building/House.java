package com.java.se.oca.model.building;

import com.java.se.oca.model.library.Book;

public class House {

    House() {
        Book book = new Book();
        String value = book.isbn;
        book.printBook();
        /*book.author = "Author Name";
        book.modifyTemplate();*/
        /*int c = book.issueCount;
        book.issueHistory();*/
    }
}
