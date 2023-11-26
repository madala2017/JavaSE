package eightfeatures.stringjoiner.demo;

import java.util.StringJoiner;

public class StringJoinerExample {

    public static void main(String[] args) {

        StringJoiner joinNames = new StringJoiner(",");
        // adding values to StringJoiner
        joinNames.add("Rahul");
        joinNames.add("Raju");
        joinNames.add("Joe");
        joinNames.add("John");
        System.out.println(joinNames);
    }
}
