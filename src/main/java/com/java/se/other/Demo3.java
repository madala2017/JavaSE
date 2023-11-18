package com.java.se.other;

import java.util.Calendar;
import java.util.Date;

public class Demo3 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        Date dateOne = c.getTime();
        Calendar c2 = Calendar.getInstance();
        c2.add(Calendar.DATE,30);
        Date date2 = c2.getTime();

        System.out.println(dateOne);
        System.out.println(date2);
    }
}
