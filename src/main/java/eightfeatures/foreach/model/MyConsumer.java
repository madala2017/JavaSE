package eightfeatures.foreach.model;

import java.util.function.Consumer;

public class MyConsumer implements Consumer<Integer> {

    @Override
    public void accept(Integer integer) {

        System.out.println("Consumer impl Value::"+ integer);
    }
}
