package com.java.se.oca.examples;

public class JavaCertQType7 {
    public static void main(String[] args) {
        String[] method = {"one","two","three","four","five"};

        for(int i = 1; i < method.length && i < 6; i+=2) {
            System.out.println(method[i]);
        }
    }
}
