package eightfeatures.defaultmethods.demo;

import eightfeatures.defaultmethods.service.Sayable;

public class DefaultMethodExample1 implements Sayable {

    @Override
    public void sayMore(String msg) {

        System.out.println(msg);
    }

    public static void main(String[] args) {

        DefaultMethodExample1 defaultMethodExample1 = new DefaultMethodExample1();

        defaultMethodExample1.say(); // calling default method

        defaultMethodExample1.sayMore("Work is worship");

        Sayable.sayLouder("Helloooooo...");
    }
}
