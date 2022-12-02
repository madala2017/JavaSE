package com.java.se.design.solid.srp;

/**
 *
 * Here we pay calculation logic with database logic and reporting logic all mixed up within one class
 * if you have multiple responsibilities combined into one class, it might be difficult to change one part without breaking others
 * */
public class Employee {

    public Pay calculatePay() {
        return new Pay();
    }
    public void save() {
    }
    public String describeEmployee() {
        return "employee description";
    }

}
