package eightfeatures.functionalinterface.demo;

import eightfeatures.functionalinterface.service.Sayable;

public class FunctionalInterfaceExample1 implements Sayable {

    @Override
    public void say(String msg) {
        System.out.println(msg);
    }

    public static void main(String[] args) {

        FunctionalInterfaceExample1 fie = new FunctionalInterfaceExample1();
        fie.say("Hello there");
    }
}
