package com.java.se.ocp.functionalprogramming.demo;

import com.java.se.ocp.functionalprogramming.interfaces.CheckTrait;
import com.java.se.ocp.functionalprogramming.models.Animal;

public class FindMatchingAnimals {

    private  static void print(Animal animal, CheckTrait trait) {
        if (trait.test(animal)) {
            System.out.println(animal);
        }
    }

    public static void main(String[] args) {

        print(new Animal("Fish",false, true), a -> a.isCanHop());
        print(new Animal("Kangaroo", true, false), a -> a.isCanHop());
    }
}
