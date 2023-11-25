package eightfeatures.functionalinterface.predefinedinterfaces;

import java.util.function.BiConsumer;

public class BiConsumerInterfaceExample {

    static void showDetails(String name, Integer age) {

        System.out.println(name+ " "+ age);
    }

    public static void main(String[] args) {

        // Referring method
        BiConsumer<String, Integer> biConsumer = BiConsumerInterfaceExample::showDetails;

        biConsumer.accept("John", 30);
        biConsumer.accept("Joe", 45);

        // Using lambda expression

        BiConsumer<String, Integer> biConsumer1 = (name, age)-> System.out.println(name+ " "+ age);

        biConsumer1.accept("Peter", 80);
    }
}
