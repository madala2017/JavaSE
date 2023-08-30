package com.java.se.other;

import java.util.Calendar;
import java.util.Date;

public class Demo2 {
    public static void main(String[] args) {

        Calendar c = Calendar.getInstance();
        c.set(Calendar.MONTH, 8);
        c.set(Calendar.DATE, 03);
        c.set(Calendar.YEAR, 2023);
        Date dateOne = c.getTime();
        Date currentDate = new Date();
        System.out.println("Is currentDate after date one : ");
        System.out.println(dateOne);
        System.out.println(currentDate);
        System.out.println(dateOne.after(currentDate));
    }
}
