package eightfeatures.lambdaexpressions.demo;

import java.util.ArrayList;
import java.util.List;

public class LambdaForEach {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("orange");
        list.add("apple");
        list.add("banana");
        list.add("peach");
        list.add("pineaple");

        list.forEach(
                (n) -> System.out.println(n)
        );
    }
}
