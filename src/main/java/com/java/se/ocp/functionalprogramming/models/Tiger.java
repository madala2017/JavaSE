package com.java.se.ocp.functionalprogramming.models;

import com.java.se.ocp.functionalprogramming.interfaces.Sprint;

public class Tiger implements Sprint {
    @Override
    public void sprint(Animal animal) {
        System.out.println("Animal is sprinting fast");
    }
}
