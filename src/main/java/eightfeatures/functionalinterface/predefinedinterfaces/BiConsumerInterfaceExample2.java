package eightfeatures.functionalinterface.predefinedinterfaces;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerInterfaceExample2 {

    static void showDetails(Map<Integer, String> map, String mapName) {
        System.out.println("------------------ "+ mapName +" Records -------------------");
        map.forEach((key, val)-> System.out.println(key+ " "+ val));
    }

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(100, "Mohan");
        map.put(110, "Sujeet");
        map.put(115, "Tom");
        map.put(120, "Danish");

        BiConsumer<Map<Integer, String>, String> biConsumer = BiConsumerInterfaceExample2::showDetails;
        biConsumer.accept(map, "Student");

    }
}
