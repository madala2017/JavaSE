package com.java.se.oca.methods.demo;

import com.java.se.oca.methods.model.Phone;

public class MainApp {
    public static void main(String[] args) {

        Phone phone = new Phone();
        phone.setPhoneNumber();
        System.out.println(phone.getPhoneNumber());
    }
}
