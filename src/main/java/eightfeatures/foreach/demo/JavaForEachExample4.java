package eightfeatures.foreach.demo;

import eightfeatures.foreach.model.MyConsumer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class JavaForEachExample4 {

    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            myList.add(i);
        }
        // traversing using Iterator

        Iterator<Integer> iterator = myList.iterator();
        while (iterator.hasNext()) {
            Integer i = iterator.next();
            System.out.println("Iterator Value::"+i);
        }

        // traversing through forEach method of Iterable with anonymous class

        System.out.println();
        myList.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println("forEach anonymous class Value::"+ integer);
            }
        });

        // traversing with Consumer interface implementation

        System.out.println();
        MyConsumer action = new MyConsumer();
        myList.forEach(action);
    }
}
