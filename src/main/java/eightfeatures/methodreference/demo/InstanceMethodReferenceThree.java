package eightfeatures.methodreference.demo;

import eightfeatures.methodreference.model.Arithmetic;

import java.util.function.BiFunction;

public class InstanceMethodReferenceThree {

    public static void main(String[] args) {

        BiFunction<Integer, Integer, Integer> adder = new Arithmetic()::addMethod;
        int result = adder.apply(100, 50);
        System.out.println(result);
    }
}
