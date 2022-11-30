package com.java.se.oca.methods.model;

public class Phone {
    private boolean tested;
    String phoneNumber;
    public void setTested(boolean val) {
        tested = val;
    }
    public boolean isTested() {
        return tested;
    }
    public void setPhoneNumber() {
        String phoneNumber;
        phoneNumber = "079 100 8774";
        System.out.println(phoneNumber);
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
}
