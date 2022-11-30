package com.java.se.hackerrank;

import java.util.List;

public class Test1 {
    public static void main(String[] args) {

    }

    public static String findNumber(List<Integer> arr, int k) {

        String result ="NO";
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).intValue() == k ) {
                result = "YES";
                break;
            }
        }
        return result;
    }
}
