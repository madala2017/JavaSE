package eightfeatures.methodreference.demo;

import eightfeatures.methodreference.service.Sayable;

public class InstanceMethodReference {

    public void saySomething() {
        System.out.println("Hello, this is non-static method referred");
    }

    public static void main(String[] args) {

        InstanceMethodReference methodReference = new InstanceMethodReference();

        // Referring non-static method using reference

        Sayable sayable = methodReference::saySomething;

        // Calling interface method
        sayable.say();

        // Referring non-static method using anonymous object
        Sayable sayable1 = new InstanceMethodReference()::saySomething;

        // Calling interface method
        sayable1.say();

    }
}
