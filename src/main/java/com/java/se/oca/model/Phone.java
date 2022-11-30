package com.java.se.oca.model;

public class Phone {

    String model;
    String company;
    double weight;
    Phone(String model) {
        this.model = model;
    }
    void makeCall(String number) {
        System.out.println("Making a call");
    }
    void receiveCall() {
        System.out.println("Receiving a call");
    }
}
