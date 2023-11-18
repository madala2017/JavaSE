package eightfeatures.lambdaexpressions.demo;

import eightfeatures.lambdaexpressions.model.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class LambdaExpressionFilterCollectionData {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();
        list.add(new Product(1,"Samsung A5",17000f));
        list.add(new Product(3,"Iphone 6S",65000f));
        list.add(new Product(2,"Sony Xperia",25000f));
        list.add(new Product(4,"Nokia Lumia",15000f));
        list.add(new Product(5,"Redmi4 ",26000f));
        list.add(new Product(6,"Lenevo Vibe",19000f));

        // using lambda filter data

        Stream<Product> filteredData = list.stream().filter(p -> p.getPrice() > 20000);

        // using lambda to iterate through collection

        filteredData.forEach(
                product -> System.out.println(product.getName() + " : "+ product.getPrice())
        );
    }
}
