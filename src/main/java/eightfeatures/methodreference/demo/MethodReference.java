package eightfeatures.methodreference.demo;

import eightfeatures.methodreference.service.Sayable;

public class MethodReference {

    public static void saySomething() {
        System.out.println("Hello, this is static method.");
    }
    public static void sayOtherThings() {
        System.out.println("Hello, saying many other different things ...........");
    }

    public static void main(String[] args) {

        // Refering static method

        Sayable sayable = MethodReference::sayOtherThings;

        // Calling interface method

        sayable.say();

    }
}
