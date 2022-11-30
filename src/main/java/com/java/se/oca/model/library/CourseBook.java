package com.java.se.oca.model.library;

public class CourseBook extends Book {

    public CourseBook() {
        author = "Author Name";
        modifyTemplate();
        int c = issueCount;
        issueHistory();
    }
}
