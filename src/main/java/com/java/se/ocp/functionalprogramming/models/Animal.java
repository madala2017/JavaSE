package com.java.se.ocp.functionalprogramming.models;

public class Animal {
    private String species;
    private boolean canHop;
    private boolean canSwim;

    public Animal(String species, boolean canHop, boolean canSwim) {
        this.species = species;
        this.canHop = canHop;
        this.canSwim = canSwim;
    }
    public boolean isCanHop() {
        return this.canHop;
    }
    public boolean isCanSwim() {
        return this.canSwim;
    }
    public String toString() {
        return this.species;
    }
}
