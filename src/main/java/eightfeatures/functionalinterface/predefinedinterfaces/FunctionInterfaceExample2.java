package eightfeatures.functionalinterface.predefinedinterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionInterfaceExample2 {

    static Integer addList(List<Integer> list) {
        return list.stream().mapToInt(Integer::intValue).sum();
    }

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(50);

        Function<List<Integer>, Integer> function = FunctionInterfaceExample2::addList;
        int result = function.apply(list);
        System.out.println("Sum of list values: "+ result);
    }
}
