package eightfeatures.lambdaexpressions.demo;

import eightfeatures.lambdaexpressions.model.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaExpressionUsingComparator {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();
        list.add(new Product(1,"HP Laptop", 5000));
        list.add(new Product(3,"Keyboard",500));
        list.add(new Product(2,"Dell Mouse", 200));

        Collections.sort(list, (p1,p2) ->{
           return p1.getName().compareTo(p2.getName());
        });

        System.out.println("Sorting on basis of name .........\n");

        for (Product p : list) {
            System.out.println(p.getId() +" "+ p.getName()+" "+p.getPrice());
        }
    }
}
