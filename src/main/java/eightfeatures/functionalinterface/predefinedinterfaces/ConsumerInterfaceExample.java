package eightfeatures.functionalinterface.predefinedinterfaces;

import java.util.function.Consumer;

public class ConsumerInterfaceExample {

    static void printMessgage(String name) {
        System.out.println("Hello, "+ name);
    }

    static void printValue(int val) {
        System.out.println(val);
    }

    public static void main(String[] args) {

        // Referring method to String type Consumer iterface

        Consumer<String> consumer = ConsumerInterfaceExample::printMessgage;
        consumer.accept("John"); // calling Consumer method

        // Referring method to Integer type Consumer interface

        Consumer<Integer> integerConsumer = ConsumerInterfaceExample::printValue;
        integerConsumer.accept(340); // calling Consumer method
    }
}
