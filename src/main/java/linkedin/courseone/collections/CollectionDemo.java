package linkedin.courseone.collections;

import java.util.*;

public class CollectionDemo {
    public static void main(String[] args) {

        usingCollectionInterface();
        System.out.println("");
        usingListInterface();
        System.out.println();
        customSorting();

    }

    public static void usingCollectionInterface() {
        Collection values = new ArrayList<>();  // don't support index numbers, can't add elements anywhere on the collection
        values.add(4);
        values.add(5);
        values.add(9);
        values.add(12);

        Iterator it = values.iterator();
        while(it.hasNext()) {
            System.out.print(it.next() +" ");
        }
    }

    public static void usingListInterface() {
        // List  interface allows use of indexes to access elements of a collection
        List<Integer> list = new ArrayList<>();
        list.add(13);
        list.add(14);
        list.add(15);
        list.add(16);
        list.add(1, 20);
        list.add(Integer.valueOf("80"));
        Collections.sort(list);
        Collections.reverse(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        for (Integer o : list) {
            System.out.print(o + " ");
        }
    }
    public static void customSorting() {

        List<Integer> values = new ArrayList<>();
        values.add(404);
        values.add(908);
        values.add(639);
        values.add(265);
        int count = 0;
        Comparator<Integer> c = new Comparator<Integer>() {

            @Override
            public int compare(Integer i, Integer j) {
                System.out.println("i = "+i+" j = "+ j +"    (" +i % 10 + " > "+ j % 10+")");

                if (i % 10 > j % 10) {
                    return 1; // swap the elements
                } else {
                    return -1; // don't swap the elements
                }
            }
        };

        Collections.sort(values,c);

        for (Integer val : values) {
            System.out.println(val);
        }
    }
}
