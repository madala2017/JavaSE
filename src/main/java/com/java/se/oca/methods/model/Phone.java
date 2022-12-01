package com.java.se.oca.methods.model;

public class Phone {
    private boolean tested;
    public static boolean softKeyboard = true;
    //boolean softKeyboard = true;
    String phoneNumber = "123456789";
    public void setTested(boolean val) {
        tested = val;
    }
    public boolean isTested() {
        return tested;
    }
    public void setPhoneNumber() {
        String phoneNumber;
        phoneNumber = "079 100 8774";
        //System.out.println(phoneNumber);
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.setPhoneNumber();
        System.out.println(phone.phoneNumber);
    }
}
