package eightfeatures.stream.demo;

import java.util.stream.Stream;

public class JavaStreamExample2 {

    public static void main(String[] args) {

        System.out.println("\n Elements without filter");
        Stream.iterate(2, element -> element + 1).limit(10).forEach(System.out::println);

        System.out.println("\n Elements when filter applied");
        Stream.iterate(1, element -> element + 1).filter(element -> element % 5 == 0).limit(5).forEach(System.out::println);
    }
}
