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

    public static void localVariableInLoop() {
        for (int ctr = 0; ctr < 5; ++ctr) {
            System.out.println(ctr);
        }
       // System.out.println(ctr); ctr is not accessible outside the for loop, this line won't compile
    }

}
