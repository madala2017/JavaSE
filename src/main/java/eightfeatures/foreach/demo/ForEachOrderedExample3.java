package eightfeatures.foreach.demo;

import java.util.ArrayList;
import java.util.List;

public class ForEachOrderedExample3 {

    public static void main(String[] args) {

        List<String> gameList = new ArrayList<>();
        gameList.add("Football");
        gameList.add("Cricket");
        gameList.add("Chess");
        gameList.add("Hocky");

        System.out.println("--------------- Iterating by passing lambda expression --------------------");

        gameList.stream().forEachOrdered(games -> System.out.println(games));

        System.out.println("----------------- Iterating by passing method reference ---------------------");
        gameList.stream().forEachOrdered(System.out::println);
    }
}
