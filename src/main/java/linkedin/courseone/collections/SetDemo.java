package linkedin.courseone.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {

        System.out.println("Using Tree Set");
        usingTreeSet();
        System.out.println("---------------------------------------");
        System.out.println("Using Hash Set");
        usingHashSet();

    }

    public static void usingTreeSet() {

        // get elements in the same order you added
        Set<Integer> values = new TreeSet<>();
        values.add(5);
        values.add(200);
        values.add(6);
        values.add(100);
        values.add(9);
        values.add(89);

        for(int i : values) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println(values);
    }

    public static void usingHashSet() {
        // randomly changes the order of elements
        Set<Integer> values = new HashSet<>();
        values.add(500);
        values.add(200);
        values.add(6);
        values.add(50);
        values.add(9);
        values.add(89);

        for(int i : values) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println(values);
    }

}
