package org.example;

import com.java.se.oca.model.Person;
import com.java.se.oca.model.library.Book;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 99; i++ ) {
            list.add(i);
        }
        list.add(300);
        sumEvenNumbers(list);

    }

    public static void sumEvenNumbers(List<Integer> list) {
        int sum = 0;
        List<Integer> evenNumbers = new ArrayList<>();
        for (int i = 0; i < list.size() && list.size() <= 100 && list.get(i) <= 100 ; i++) {
            if ( list.get(i) % 2 == 0 ) {
                sum+= list.get(i);
                evenNumbers.add(list.get(i));
            }
        }
        System.out.println(evenNumbers);
        System.out.println(sum);
    }
}