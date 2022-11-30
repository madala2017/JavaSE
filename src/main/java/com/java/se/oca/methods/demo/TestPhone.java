package com.java.se.oca.methods.demo;

import com.java.se.oca.methods.model.Phone;

public class TestPhone {
    public static void main(String[] args) {

        Phone.softKeyboard = false;
        Phone phone = new Phone();
        Phone phone1 = new Phone();
        Phone phone2 = null;

        System.out.println(phone.softKeyboard);
        System.out.println(phone1.softKeyboard);
        System.out.println(phone2.softKeyboard);

        phone1.softKeyboard = true;
        System.out.println("After changing");
        System.out.println(phone2.softKeyboard);
        System.out.println(phone.softKeyboard);
        System.out.println(phone1.softKeyboard);
        System.out.println(Phone.softKeyboard);
    }
}
