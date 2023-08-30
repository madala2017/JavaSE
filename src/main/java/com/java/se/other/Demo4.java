package com.java.se.other;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Demo4 {
    public static void main(String[] args) {
        String emails = "sipho@gmail.com; siphe@santam.co.za; sisanda@gmail.com;";
        String[] array = emails.split(";");
        List<String> list = new ArrayList<String>(Arrays.asList(array));
       // list.removeAll(Arrays.asList("", null));
        System.out.println(list);
    }
}
