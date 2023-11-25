package eightfeatures.functionalinterface.predefinedinterfaces;

import java.util.function.Predicate;

public class PredicateInterfaceExample2 {

    static Boolean checkAge(int age) {
        if (age > 17)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {

        Predicate<Integer> predicate = PredicateInterfaceExample2::checkAge;

        boolean result = predicate.test(25);

        System.out.println(result);
    }
}
