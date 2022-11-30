package com.java.se.ocp.interfaces;

public interface Fly {

    public static final int MaX_SPEED = 100;
    int getWingSpan() throws Exception;
    public default void land() {
        System.out.println("Animal is landing");
    }
    public static double calculateSpeed(float distance, double time) {
        return  distance/time;
    }
}
