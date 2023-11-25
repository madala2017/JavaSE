package eightfeatures.functionalinterface.predefinedinterfaces;

import java.util.function.Function;

public class FunctionInterfaceExample {

    static String show(String message) {

        return "Hello "+ message;
    }

    public static void main(String[] args) {

        // Function interface referring to a method
        Function<String,String> function = FunctionInterfaceExample::show;

        // calling Function interface method
        System.out.println(function.apply("Peter"));
    }
}
