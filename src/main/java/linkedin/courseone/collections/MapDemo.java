package linkedin.courseone.collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {

        System.out.println("Using Hash Map");
        usingHashMap();
        System.out.println("Using Hash Table");
        usingHashTable();

    }

    public static void usingHashMap() {
        // HashMap not thread safe
        Map<String,String> map = new HashMap<>();
        map.put("myName","Navin");
        map.put("actor", "John");
        map.put("ceo", "Marisa");

        Set<String> keys = map.keySet();

        System.out.println(map);

        for (String key : keys) {
            System.out.println(key + "  " + map.get(key));
        }
    }

    public static void usingHashTable() {

        // Hashtable is thread safe
        Map<String,String> map = new Hashtable<>();
        map.put("myName","Navin");
        map.put("actor", "John");
        map.put("ceo", "Marisa");

        Set<String> keys = map.keySet();

        System.out.println(map);

        for (String key : keys) {
            System.out.println(key + "  " + map.get(key));
        }
    }
}
