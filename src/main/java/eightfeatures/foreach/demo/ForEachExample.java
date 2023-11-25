package eightfeatures.foreach.demo;

import java.util.ArrayList;
import java.util.List;

public class ForEachExample {

    public static void main(String[] args) {

        List<String> gameList = new ArrayList<>();
        gameList.add("Football");
        gameList.add("Cricket");
        gameList.add("Chess");
        gameList.add("Hocky");

        System.out.println("------------------- Iterating by lambda expression -----------------------");
        gameList.forEach(games -> System.out.println(games));

    }
}
