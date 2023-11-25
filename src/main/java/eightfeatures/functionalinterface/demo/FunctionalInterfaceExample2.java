package eightfeatures.functionalinterface.demo;

import eightfeatures.functionalinterface.service.Sayable;

public class FunctionalInterfaceExample2 implements Sayable {

    @Override
    public void say(String msg) {
        System.out.println(msg);
    }

    public static void main(String[] args) {

        FunctionalInterfaceExample2 fie = new FunctionalInterfaceExample2();

        fie.say("Hello there again");
        fie.doIt();
    }
}
