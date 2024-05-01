package com.java.se.other;

import java.math.BigDecimal;

public class TestBigDecimalDemo {
    public static void main(String[] args) {

        BigDecimal premium = BigDecimal.ZERO;
        BigDecimal percentage = BigDecimal.ZERO;

        if (premium.compareTo(BigDecimal.ZERO) <= 0 && percentage.compareTo(BigDecimal.ZERO) <= 0) {
            System.out.println("Please provide a valid premium.");
        } else {
            System.out.println("All is good!!!!!!!!!!!!!!!!!!!!");
        }
    }
}
