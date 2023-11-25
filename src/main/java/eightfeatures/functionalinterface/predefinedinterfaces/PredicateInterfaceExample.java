package eightfeatures.functionalinterface.predefinedinterfaces;

import java.util.function.Predicate;

public class PredicateInterfaceExample {

    public static void main(String[] args) {

        Predicate<Integer> predicate = a -> (a > 18);

        System.out.println(predicate.test(10));
    }
}
