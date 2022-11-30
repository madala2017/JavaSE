package com.java.se.oca.methods.model;

public class Student {

    private double marks1, marks2, marks3;
    private double maxMarks = 100;

    public double getAverage() {
        double avg = 0;
        if (maxMarks > 0) {

            avg += ((marks1+marks2+marks3)/ (maxMarks*3)) * 100;
            return avg;
        } else {
            avg = 0;
            return avg;
        }
    }

}
