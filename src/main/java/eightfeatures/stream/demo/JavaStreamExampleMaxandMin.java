package eightfeatures.stream.demo;

import eightfeatures.stream.model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class JavaStreamExampleMaxandMin {

    public static void main(String[] args) {

        List<Product> productsList = new ArrayList<Product>();
        //Adding Products
        productsList.add(new Product(1,"HP Laptop",25000f));
        productsList.add(new Product(2,"Dell Laptop",30000f));
        productsList.add(new Product(3,"Lenevo Laptop",35000f));
        productsList.add(new Product(4,"Sony Laptop",28000f));
        productsList.add(new Product(5,"Apple Laptop",90000f));

        // max method to get max Product price

        Product productA = productsList.stream().max((product1, product2) -> product1.getPrice() > product2.getPrice() ? 1 : -1).get();

        System.out.println(productA.getPrice());

        // min method to get min Product price
        Product productB = productsList.stream().min((product1, product2) -> product1.getPrice() > product2.getPrice() ? 1:-1).get();
        System.out.println(productB.getPrice());

        // count number of products based on the filter
        long count = productsList.stream().filter(product -> product.getPrice() < 30000).count();
        System.out.println(count);

        // Converting product List into Set

        Set<Float> productPriceSet = productsList.stream().filter(product -> product.getPrice() < 30000).map(product -> product.getPrice()).collect(Collectors.toSet());
        System.out.println(productPriceSet);

        // Converting Product List into a Map

        Map<Integer, String> productPriceMap = productsList.stream().collect(Collectors.toMap(product -> product.getId(),product -> product.getName()));
        System.out.println(productPriceMap);

    }
}
