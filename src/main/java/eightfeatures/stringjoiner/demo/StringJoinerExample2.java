package eightfeatures.stringjoiner.demo;

import java.util.StringJoiner;

public class StringJoinerExample2 {

    public static void main(String[] args) {

        StringJoiner stringJoiner = new StringJoiner(",", "[", "]");

        stringJoiner.add("Rahul");
        stringJoiner.add("Raju");
        stringJoiner.add("Joe");
        stringJoiner.add("John");

        System.out.println();
        System.out.println(stringJoiner);
    }
}
