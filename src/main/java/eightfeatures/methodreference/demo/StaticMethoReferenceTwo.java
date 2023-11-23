package eightfeatures.methodreference.demo;

import eightfeatures.methodreference.model.Arithmetic;

import java.util.function.BiFunction;

public class StaticMethoReferenceTwo {

    public static void main(String[] args) {

        BiFunction<Integer, Integer, Integer> adder1 = Arithmetic::add;
        BiFunction<Integer, Float, Float> adder2 = Arithmetic::add;
        BiFunction<Float, Float, Float> adder3 = Arithmetic::add;

        int result1 = adder1.apply(10,30);
        float result2 = adder2.apply(20,50.0f);
        float result3 = adder3.apply(30.0f, 60.0f);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
